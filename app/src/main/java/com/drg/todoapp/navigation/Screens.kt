package com.drg.todoapp.navigation

import androidx.navigation.NavHostController
import com.drg.todoapp.util.Action
import com.drg.todoapp.util.Constants.LIST_SCREEN

/**
 * Created by Andreea on 7/27/2023
 * Name of project: ToDoApp
 */
class Screens(navController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = { taskId -> navController.navigate("task/$taskId") }
}