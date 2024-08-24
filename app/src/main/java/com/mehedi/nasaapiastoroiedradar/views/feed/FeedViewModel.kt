package com.mehedi.nasaapiastoroiedradar.views.feed

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehedi.nasaapiastoroiedradar.data.remote.api.AsteroidNetwork
import com.mehedi.nasaapiastoroiedradar.db.model.Asteroid
import com.mehedi.nasaapiastoroiedradar.utils.parseAsteroidJsonResult
import kotlinx.coroutines.launch
import org.json.JSONObject

class FeedViewModel:ViewModel() {
    private val _asteroidList = MutableLiveData<List<Asteroid>>()
    val asteroidList: LiveData<List<Asteroid>>
        get() = _asteroidList

    private val _status = MutableLiveData<String>()
    val status: LiveData<String>
        get() = _status

    init {
        getAsteroidData()
    }

    private fun getAsteroidData() {
        viewModelScope.launch {
            try {
                // Call the network service
                val response = AsteroidNetwork.asteroidService.getAsteroidFeed()

                if (response.isSuccessful) {
                    response.body()?.let {
                        // Parse JSON and update LiveData
                        val jsonResult = JSONObject(it)
                        val asteroidList = parseAsteroidJsonResult(jsonResult)
                        _asteroidList.value = asteroidList
                        Log.d("TAG", "getAsteroidData: ${asteroidList[0].codename}")
                    }
                } else {
                    _status.value = "Error: ${response.message()}"
                }
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }
        }
    }

}