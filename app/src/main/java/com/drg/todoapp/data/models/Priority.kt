package com.drg.todoapp.data.models

import androidx.compose.ui.graphics.Color
import com.drg.todoapp.ui.theme.HighPriorityColor
import com.drg.todoapp.ui.theme.LowPriorityColor
import com.drg.todoapp.ui.theme.MediumPriorityColor
import com.drg.todoapp.ui.theme.NonePriorityColor


/**
 * Created by Andreea on 7/26/2023
 * Name of project: ToDoApp
 */
enum class Priority(val color: Color) {

    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)


}