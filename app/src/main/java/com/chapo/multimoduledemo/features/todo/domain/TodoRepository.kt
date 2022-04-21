package com.chapo.multimoduledemo.features.todo.domain

import com.chapo.multimoduledemo.features.todo.domain.model.Todo

interface TodoRepository {
    fun getTodos(): List<Todo>
}