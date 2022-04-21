package com.chapo.domain

import com.chapo.domain.model.Todo

interface TodoRepository {
    fun getTodos(): List<Todo>
}