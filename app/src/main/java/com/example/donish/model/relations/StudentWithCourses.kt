package com.example.donish.model.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.donish.model.Course
import com.example.donish.model.Student
import com.example.donish.model.consts.Const.COURSE_ID
import com.example.donish.model.consts.Const.STUDENT_ID

/**
 * This class has a reference to list of Courses that an
 * individual students takes
 *
 * M - to - M Relationship
 * */
data class StudentWithCourses(
    @Embedded
    val  student: Student,
    @Relation(
        parentColumn = STUDENT_ID,
        entityColumn = COURSE_ID,
        associateBy = Junction(Enrollments::class)
    )
    val courses : List<Course>
)
