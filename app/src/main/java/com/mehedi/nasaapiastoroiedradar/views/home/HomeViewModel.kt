package com.mehedi.nasaapiastoroiedradar.views.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehedi.nasaapiastoroiedradar.data.remote.api.ResponseImageOfTheDay
import com.mehedi.nasaapiastoroiedradar.data.remote.api.Network
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _imageOfTheDay = MutableLiveData<ResponseImageOfTheDay>()
    val imageOfTheDay: LiveData<ResponseImageOfTheDay>
        get() = _imageOfTheDay

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean>
        get() = _loading

    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    init {
        getImageOfTheDay()
    }

    private fun getImageOfTheDay() {
        _loading.value = true

        viewModelScope.launch {
            try {
                val response = Network.imageOfTheDayService.getImageOfTheDay()
                if (response.isSuccessful && response.body() != null) {
                    _imageOfTheDay.postValue(response.body())
                } else {
                    _error.postValue("Error fetching image of the day")
                }
            } catch (e: Exception) {
                _error.postValue("Network request failed: ${e.message}")
            } finally {
                _loading.postValue(false)
            }
        }
    }
}