package com.chapo.data.remote

import com.chapo.data.model.TodoDto

interface TodoApi {
    fun getTodos(): List<TodoDto>
}