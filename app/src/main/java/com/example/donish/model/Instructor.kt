package com.example.donish.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.donish.model.consts.Const.COURSE_ID
import com.example.donish.model.consts.Const.INSTRUCTOR_ID

@Entity()
data class Instructor(
    @PrimaryKey(autoGenerate = true)
    var instructorId: Int = 0,
    val firstName: String,
    val secondName: String,
    var courseId: Int = 1
)
