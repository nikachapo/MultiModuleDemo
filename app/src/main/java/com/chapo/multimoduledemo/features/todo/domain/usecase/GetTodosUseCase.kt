package com.chapo.multimoduledemo.features.todo.domain.usecase

import com.chapo.multimoduledemo.features.todo.domain.TodoRepository
import com.chapo.multimoduledemo.features.todo.domain.model.Todo
import javax.inject.Inject

class GetTodosUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {
    operator fun invoke(): List<Todo> {
        return todoRepository.getTodos()
    }
}