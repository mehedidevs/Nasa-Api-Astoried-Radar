package com.mehedi.nasaapiastoroiedradar.utils

import com.mehedi.nasaapiastoroiedradar.db.model.Asteroid
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

fun parseAsteroidJsonResult(jsonObject: JSONObject): ArrayList<Asteroid>? {
    val nearEarthObjects = jsonObject.getJSONObject("near_earth_objects")
    val asteroidList = ArrayList<Asteroid>()

    val next7Days = getNext7Days()

    return null
}

fun getNext7Days(): ArrayList<String>{
    val listOfDays = ArrayList<String>()

    val calendar = Calendar.getInstance()

    for (i in 1..7){
        val currentTime = calendar.time
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        listOfDays.add(dateFormat.format(currentTime))
        calendar.add(Calendar.DAY_OF_YEAR,1)
    }

    return listOfDays
}