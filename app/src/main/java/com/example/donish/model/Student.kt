package com.example.donish.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date


@Entity
data class Student(
    @PrimaryKey(autoGenerate = true)
    val studentId : Int = 0,
    val firstName : String,
    val secondName : String,
    val age : Int,
    val email : String,
    val dateRegistered : Date

)
