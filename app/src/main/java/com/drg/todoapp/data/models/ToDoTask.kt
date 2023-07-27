package com.drg.todoapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.drg.todoapp.util.Constants.DATABASE_TABLE

/**
 * Created by Andreea on 7/26/2023
 * Name of project: ToDoApp
 */

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)