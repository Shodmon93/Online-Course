package com.example.donish.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
private const val CHILD_COLUMN : String = "courseId"
private const val PARENT_COLUMN : String = "id"

@Entity(
    foreignKeys = [ForeignKey(
        entity = Course::class,
        parentColumns = [PARENT_COLUMN],
        childColumns = [CHILD_COLUMN],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Instructor(
    @PrimaryKey(autoGenerate = true)
   private val id : Int = 0,
    val firstName : String,
    val secondName : String,
    val courseId : Int
)