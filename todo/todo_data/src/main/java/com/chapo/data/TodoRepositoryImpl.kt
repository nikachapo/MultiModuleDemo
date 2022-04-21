package com.chapo.data

import com.chapo.data.mapper.toDomain
import com.chapo.data.remote.TodoApi
import com.chapo.domain.TodoRepository
import com.chapo.domain.model.Todo
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoApi: TodoApi
) : TodoRepository {
    override fun getTodos(): List<Todo> {
        return todoApi.getTodos().map { it.toDomain() }
    }
}