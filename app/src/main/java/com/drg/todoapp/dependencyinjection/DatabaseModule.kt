package com.drg.todoapp.dependencyinjection

import android.content.Context
import androidx.room.Room
import com.drg.todoapp.data.dao.ToDoDatabase
import com.drg.todoapp.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */


/**
 * in this module, we need to describe how we want provide instances of certain types,
 * which we want to inject later.
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    /**
     * have only one instance of our room db
     * specify the name of db and build own db
     */
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        DATABASE_NAME
    ).build()

    /**
     * provide our dao to create room db builder
     */
    @Singleton
    @Provides
    fun provideDao(database: ToDoDatabase) = database.toDoDao()


}