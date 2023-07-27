package com.drg.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.drg.todoapp.navigation.destinations.listComposable
import com.drg.todoapp.navigation.destinations.taskComposable
import com.drg.todoapp.util.Constants.LIST_SCREEN

/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */

@Composable

fun SetupNavigation(navController: NavHostController) {

    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)
    }
}