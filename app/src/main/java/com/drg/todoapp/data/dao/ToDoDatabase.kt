package com.drg.todoapp.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.drg.todoapp.data.models.ToDoTask

/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */

/**
 * we have a one entity / one table and the database's version
 */
@Database(entities = [ToDoTask::class], version = 1)
abstract class ToDoDatabase : RoomDatabase() {

    /**
     * return toDoDao interface
     */
    abstract fun toDoDao(): ToDoDao


}