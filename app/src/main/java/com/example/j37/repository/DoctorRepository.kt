package com.example.j37.repository

import com.example.j37.models.Doctor
import android.content.Context
import com.example.j37.Databases.AppDatabase
import com.example.j37.Databases.DoctorDao

object DoctorRepository {

    var db:AppDatabase?=null
    var dao:DoctorDao?=null

    fun initDB(context: Context){
        db= AppDatabase.getAppDatabase(context)
        dao=db?.doctorDao()
    }

    fun insertDoctor(){
        dao?.insertAll(
            Doctor(1,"ali","ghalb",45),
            Doctor(2,"saeed","ghalb",25)
        )
    }
    fun getDoctor(id:Int): Doctor?{
        return dao?.getDoctor(id)
    }

    fun getDoctorList():List<Doctor>?{
        return dao?.getAllDoctor()
    }
}