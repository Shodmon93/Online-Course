package com.example.donish.model.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.donish.model.Course
import com.example.donish.model.Instructor
import com.example.donish.model.consts.Const.COURSE_ID
import com.example.donish.model.consts.Const.INSTRUCTOR_ID

/**
 * This class has reference to list of Courses which
 * an individual instructors teach
 *
 * O - to - M Relationship
 * */
data class InstructorWithCourses(
    @Embedded
    var instructor: Instructor,
    @Relation(
        parentColumn = INSTRUCTOR_ID,
        entityColumn = COURSE_ID
    )
    val courses : List<Course>
)
