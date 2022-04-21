package com.chapo.multimoduledemo.features.todo.data

import com.chapo.multimoduledemo.features.todo.data.mapper.toDomain
import com.chapo.multimoduledemo.features.todo.data.remote.TodoApi
import com.chapo.multimoduledemo.features.todo.domain.TodoRepository
import com.chapo.multimoduledemo.features.todo.domain.model.Todo
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoApi: TodoApi
) : TodoRepository {
    override fun getTodos(): List<Todo> {
        return todoApi.getTodos().map { it.toDomain() }
    }
}