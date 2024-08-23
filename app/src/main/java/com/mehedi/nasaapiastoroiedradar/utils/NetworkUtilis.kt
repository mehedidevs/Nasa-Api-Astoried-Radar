package com.mehedi.nasaapiastoroiedradar.utils

import com.mehedi.nasaapiastoroiedradar.data.local.Asteroid
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


fun parseAsteroidJsonResult(jsonObject: JSONObject):ArrayList<Asteroid>?{

val nearEarthObjects = jsonObject.getJSONObject("near_earth_objects")
val  asteroidList = ArrayList<Asteroid>()
    val next7Days = getNext7Days()
    for (formatedDate in next7Days){

        val dateWiseData = nearEarthObjects.getJSONArray(formatedDate)
        for (index in 0 until dateWiseData.length() ){

            val asteroidJson = dateWiseData.getJSONObject(index)
            val id = asteroidJson.getLong("id")
            val codename = asteroidJson.getString("name")
            val closeApproachData= asteroidJson.
            getJSONArray("close_approach_data").
            getJSONObject(0)
            val closeApproachDate = closeApproachData.getString("close_approach_date")
            val absoluteMagnitude = asteroidJson.getDouble("absolute_magnitude_h")
            val estimatedDiameterJson = asteroidJson.getJSONObject("estimated_diameter").getJSONObject("kilometers")
            val estimatedDiameterMin = estimatedDiameterJson.getDouble("estimated_diameter_min")
            val estimatedDiameterMax = estimatedDiameterJson.getDouble("estimated_diameter_max")
            val estimatedDiameter = (estimatedDiameterMin + estimatedDiameterMax) / 2
            val relativeVelocity = closeApproachData.getJSONObject("relative_velocity")
                .getDouble("kilometers_per_second")
            val distanceFromEarth = closeApproachData.getJSONObject("miss_distance")
                .getDouble("kilometers")
            val isPotentiallyHazardous = asteroidJson.getBoolean("is_potentially_hazardous_asteroid")

            val asteroid = Asteroid(
                id,
                codename,
                closeApproachDate,
                absoluteMagnitude,
                estimatedDiameter,
                relativeVelocity,
                distanceFromEarth,
                isPotentiallyHazardous
            )

            asteroidList.add(asteroid)
        }

    }

    return asteroidList

}

private fun getNext7Days () : ArrayList<String>{

    val listOfDays = ArrayList<String>()
    val calendar = Calendar.getInstance()

    for (i in 0..7){


        val currentTime=calendar.time
        val dateFormat= SimpleDateFormat("yyy-MM-dd",Locale.getDefault())
        listOfDays.add(dateFormat.format(currentTime))
        calendar.add(Calendar.DAY_OF_YEAR,1)
    }
return listOfDays

}
