package com.chapo.data.remote

import com.chapo.data.model.TodoDto
import javax.inject.Inject

class TodoApiImpl @Inject constructor() : TodoApi {
    override fun getTodos(): List<TodoDto> {
        return listOf(
            TodoDto("Task1"),
            TodoDto("Task2"),
            TodoDto("Task3"),
            TodoDto("Task4"),
            TodoDto("Task5"),
            TodoDto("Task6"),
        )
    }
}