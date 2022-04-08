package com.example.j37.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Doctor(@PrimaryKey val id:Int, val name:String, val speciality:String, val age:Int)