package com.example.j37.ViewModels

import com.example.j37.models.Doctor
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.j37.repository.DoctorRepository


class MainViewModel(app:Application):AndroidViewModel(app) {

    var doctorById=MutableLiveData<Doctor>()
    val doctorList=MutableLiveData<List<Doctor>>()

    init{
        DoctorRepository.initDB(app.applicationContext)
        doctorList.value=DoctorRepository.getDoctorList()
    }

    fun getDoctor(id:Int){

    }
}