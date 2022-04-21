package com.chapo.multimoduledemo.features.todo.data.mapper

import com.chapo.multimoduledemo.features.todo.data.model.TodoDto
import com.chapo.multimoduledemo.features.todo.domain.model.Todo

fun TodoDto.toDomain() = Todo(todo)