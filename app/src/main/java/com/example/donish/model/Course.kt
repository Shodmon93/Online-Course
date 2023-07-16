package com.example.donish.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Course(
    @PrimaryKey(autoGenerate = true)
    val courseId : Int = 0,
    val title : String,
    val description: String,
    val price : Double,
    val image : String

)
