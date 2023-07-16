package com.example.donish

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.donish.dao.ApplicationDao
import com.example.donish.model.Converters
import com.example.donish.model.Course
import com.example.donish.model.Enrollments
import com.example.donish.model.Instructor
import com.example.donish.model.Student
import com.example.donish.model.Tags


@Database(
    entities = [
        Course::class,
        Student::class,
        Instructor::class,
        Enrollments::class,
        Tags::class
    ],
    version = 1,exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract val applicationDao: ApplicationDao


    companion object {

        @Volatile
        private var INSTANCE: ApplicationDatabase? = null

        fun getInstance(context: Context): ApplicationDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "Application_db"
                ).addTypeConverter(Converters::class)
                    .build()
                    .also {
                        INSTANCE = it
                    }
            }
        }

    }
}