package com.chapo.domain.usecase

import com.chapo.domain.TodoRepository
import com.chapo.domain.model.Todo
import javax.inject.Inject

class GetTodosUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {
    operator fun invoke(): List<Todo> {
        return todoRepository.getTodos()
    }
}