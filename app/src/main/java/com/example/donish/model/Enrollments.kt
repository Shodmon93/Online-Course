package com.example.donish.model

import androidx.room.Entity
import java.sql.Date


// Student and Course cross reference
/**
 * This class is an Entity for the room to cross join two tables
 * The primary keys hold reference to studentId field in Student Table
 * And courseId field in Course Table
 * ------
 * M - to - M Relationship
 * */
@Entity(primaryKeys = ["studentId","courseId"])
data class Enrollments(
    var studentId : Int,
    val courseId : Int,
    val dateRegistered: Date,
    val price : Double
)
