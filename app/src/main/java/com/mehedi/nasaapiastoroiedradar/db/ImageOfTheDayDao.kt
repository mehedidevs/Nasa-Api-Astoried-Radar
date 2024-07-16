package com.mehedi.nasaapiastoroiedradar.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface ImageOfTheDayDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(image: ImageOfTheDayEntity)

    @Query("SELECT * FROM image_of_the_day")
    fun getAllData(): LiveData<List<ImageOfTheDayEntity>>
}