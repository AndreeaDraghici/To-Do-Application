package com.drg.todoapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.drg.todoapp.util.Constants.LIST_ARGUMENT_KEY
import com.drg.todoapp.util.Constants.LIST_SCREEN

/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */

fun NavGraphBuilder.listComposable(navigateToTaskScreen: (Int) -> Unit) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {

    }
}