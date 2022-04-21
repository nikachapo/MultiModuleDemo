package com.chapo.multimoduledemo.features.registration

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor() : ViewModel() {

    var name by mutableStateOf("")
        private set

    fun onNameChange(value: String) {
        name = value
    }

    fun onRegistrationClick() {

    }

}