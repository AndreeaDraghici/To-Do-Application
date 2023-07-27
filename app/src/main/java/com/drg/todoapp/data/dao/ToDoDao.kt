package com.drg.todoapp.data.dao

import androidx.room.*
import com.drg.todoapp.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow


/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */

@Dao
interface ToDoDao {

    /**
     * this function will basically read the all tasks from my database table
     * and this function should return a flow (multiple to-do tasks).
     *
     * We should wrap a list of to-do tasks in a flow.
     */
    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<ToDoTask>>


    /**
     * return a single To-do task.
     */
    @Query("SELECT * FROM todo_table WHERE id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<ToDoTask>

    /**
     * add new task to our database
     * suspend fun - because will be run inside a coroutine
     */


    @Insert(onConflict = OnConflictStrategy.IGNORE) //specify one param and that is on conflict strategy.
    suspend fun addToDoTask(toDoTask: ToDoTask)

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deleteTask(toDoTask: ToDoTask)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTasks()

    /**
     * added a search query of a type string
     * return a list of multiple tasks wrapped in a flow.
     */
    @Query("SELECT * FROM todo_table WHERE title LIKE:searchQuery OR description LIKE: searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>>

    /**
     * sort first those tasks that start with L, which is low.
     * next priority is like M, which stands for Medium.
     *
     */
    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<ToDoTask>>
}