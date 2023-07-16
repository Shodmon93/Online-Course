package com.example.donish.model.relations

import androidx.room.Entity
import java.text.DateFormat


// Student and Course cross reference
/**
 * This class is an Entity for the room to cross join two tables
 * The primary keys hold reference to studentId field in Student Table
 * And courseId field in Course Table
 * ------
 * M - to - M Relationship
 * */
@Entity(primaryKeys = ["studentId","courseID"])
data class Enrollments(
    var studentId : Int,
    var courseID : Int,
    var dateRegistered : DateFormat,
    var price : Double
)
