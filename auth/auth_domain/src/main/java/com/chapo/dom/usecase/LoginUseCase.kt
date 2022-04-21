package com.chapo.dom.usecase

import com.chapo.dom.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository
) {

    operator fun invoke(name: String) {
        loginRepository.login(name)
    }
}