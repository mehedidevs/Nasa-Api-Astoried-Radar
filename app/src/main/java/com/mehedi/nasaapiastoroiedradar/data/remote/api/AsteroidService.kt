package com.mehedi.nasaapiastoroiedradar.data.remote.api

import com.mehedi.nasaapiastoroiedradar.utils.Constant.API_KEY
import com.mehedi.nasaapiastoroiedradar.utils.Constant.BASE_URL
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface AsteroidService {
    @GET("neo/rest/v1/feed")
    suspend fun getAsteroidFeed(@Query("api_key") apiKey: String = API_KEY): Response<String>
}

object AsteroidNetwork {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()

    val asteroidService: AsteroidService = retrofit.create(AsteroidService::class.java)

}

