package com.example.j37.Databases

import com.example.j37.models.Doctor
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Doctor::class], version = 1 )
abstract class AppDatabase :RoomDatabase(){

abstract fun doctorDao():DoctorDao


companion object{
    var instance : AppDatabase?=null
    fun getAppDatabase(context: Context):AppDatabase?{
        if (instance==null) {
            synchronized(AppDatabase::class) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "DoctorDB"
                )
                    .allowMainThreadQueries()
                    .build()
            }
        }
        return instance

    }
}
}