package com.chapo.multimoduledemo.features.todo.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.chapo.multimoduledemo.features.todo.domain.model.Todo
import com.chapo.multimoduledemo.features.todo.domain.usecase.GetTodosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodosViewModel @Inject constructor(
    private val getTodosUseCase: GetTodosUseCase
) : ViewModel() {

    var state by mutableStateOf<List<Todo>>(emptyList())
        private set

    init {
        state = getTodosUseCase()
    }
}