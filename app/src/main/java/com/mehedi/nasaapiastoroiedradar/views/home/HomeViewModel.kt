package com.mehedi.nasaapiastoroiedradar.views.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehedi.nasaapiastoroiedradar.data.remote.api.ResponseImageOfTheDay
import com.mehedi.nasaapiastoroiedradar.data.remote.api.Network
import com.mehedi.nasaapiastoroiedradar.db.AppDatabase
import com.mehedi.nasaapiastoroiedradar.db.ImageOfTheDayEntity
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val database = AppDatabase.getDatabase(application)
    private val imageOfTheDayDao = database.imageOfTheDayDao()

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
                    val image = response.body()!!
                    _imageOfTheDay.postValue(image)
                    imageOfTheDayDao.insert(
                        ImageOfTheDayEntity(
                        date = image.date!!,
                        explanation = image.explanation,
                        hdurl = image.hdurl,
                        mediaType = image.mediaType,
                        serviceVersion = image.serviceVersion,
                        title = image.title,
                        url = image.url
                    )
                    )
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

    fun getImageFromDb(date: String): LiveData<ImageOfTheDayEntity> {
        return imageOfTheDayDao.getImage(date)
    }
}