package com.example.donish.model.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.donish.model.Course
import com.example.donish.model.Enrollments
import com.example.donish.model.Student
import com.example.donish.model.consts.Const.COURSE_ID
import com.example.donish.model.consts.Const.STUDENT_ID

/**
 * This class has a reference to list of Students who takes a
 * specific course
 *
 * M - to - M Relationship
 * */
data class CoursesWithStudent(
    @Embedded
    val course: Course,
    @Relation(
        parentColumn = COURSE_ID,
        entityColumn = STUDENT_ID,
        associateBy = Junction(Enrollments::class)
    )
    val students: List<Student>


)
