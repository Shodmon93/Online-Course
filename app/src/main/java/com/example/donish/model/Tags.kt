package com.example.donish.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Tags(
    @PrimaryKey(autoGenerate = true)
    val tagId : Int? = 0,
    val tagName : String
)
