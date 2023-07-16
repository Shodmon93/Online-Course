package com.example.donish.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.donish.model.Course
import com.example.donish.model.Enrollments
import com.example.donish.model.Instructor
import com.example.donish.model.Student
import com.example.donish.model.Tags
import com.example.donish.model.relations.CoursesWithStudent
import com.example.donish.model.relations.InstructorWithCourses
import com.example.donish.model.relations.StudentWithCourses

@Dao
interface ApplicationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun registerStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun enrollStudent(enrollment: Enrollments)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addInstructor(instructor: Instructor)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCourses(course: Course)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addTag(tags: Tags)

    @Query("SELECT * FROM Course")
     fun getCourses(): LiveData<Course>

    @Query("SELECT * FROM Student")
     fun getStudent(): LiveData<Student>

    @Transaction
    @Query("SELECT * FROM Student s WHERE  s.studentId = :studentId")
     fun getStudentWithCourses(studentId: Int): LiveData<StudentWithCourses>

    @Transaction
    @Query("SELECT * FROM Course c WHERE c.courseId = :courseId")
     fun getCourseWithStudents(courseId: Int): LiveData<CoursesWithStudent>


    @Transaction
    @Query("SELECT * FROM Instructor i WHERE i.instructorId = :instructorId")
     fun getInstructorWithCourses(instructorId: Int): LiveData<InstructorWithCourses>
}