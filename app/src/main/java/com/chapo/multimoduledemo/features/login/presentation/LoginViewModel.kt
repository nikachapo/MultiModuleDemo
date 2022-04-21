package com.chapo.multimoduledemo.features.login.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chapo.multimoduledemo.core.navigation.Routes
import com.chapo.multimoduledemo.features.login.domain.LoginRepository
import com.chapo.multimoduledemo.features.login.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _navigate = MutableSharedFlow<String>()
    val navigate = _navigate.asSharedFlow()

    var name by mutableStateOf("")
        private set

    fun onNameChange(value: String) {
        name = value
    }

    fun onLoginClick() {
        loginUseCase(name)
        viewModelScope.launch {
            _navigate.emit(Routes.Todo)
        }
    }

    fun onRegistrationClick() {
        viewModelScope.launch {
            _navigate.emit(Routes.Registration)
        }
    }

}