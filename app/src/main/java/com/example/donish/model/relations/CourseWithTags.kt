package com.example.donish.model.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.donish.model.Course
import com.example.donish.model.Tags
import com.example.donish.model.consts.Const.COURSE_ID
import com.example.donish.model.consts.Const.TAG_ID

/**
 * This class holds a reference to list of tags
 * which belongs to the course
 *
 * O - to - M Relationship
 * **/
data class CourseWithTags(
    @Embedded
    val course: Course,

    @Relation(
        parentColumn = COURSE_ID,
        entityColumn = TAG_ID
    )
    val tags: List<Tags>
)
