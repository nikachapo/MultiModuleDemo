package com.chapo.data.mapper

import com.chapo.data.model.TodoDto
import com.chapo.domain.model.Todo

fun TodoDto.toDomain() = Todo(todo)