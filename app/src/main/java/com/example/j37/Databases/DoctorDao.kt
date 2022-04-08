package com.example.j37.Databases

import com.example.j37.models.Doctor
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface DoctorDao {

    @Query ("SELECT * FROM Doctor")
    fun getAllDoctor():List<Doctor>

    @Query("SELECT * FROM Doctor WHERE id IN (:doctorId)")
    fun getDoctor(doctorId:Int): Doctor

    @Insert
    fun insertAll(vararg doctor: Doctor)



}