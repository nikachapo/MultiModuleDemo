package com.chapo.multimoduledemo.features.todo.data.remote

import com.chapo.multimoduledemo.features.todo.data.model.TodoDto

interface TodoApi {
    fun getTodos(): List<TodoDto>
}