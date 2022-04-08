package com.example.j37.UI

import com.example.j37.models.Doctor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.j37.R
import com.example.j37.ViewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    val vmodel: MainViewModel by viewModels()
    lateinit var doctorList:List<Doctor>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vmodel.doctorList.observe(this){
            doctorList=it
        }

        //val s=doctorList[0]

       // val textView=findViewById<TextView>(R.id.textView)
       // textView.text=s.toString()
    }
}