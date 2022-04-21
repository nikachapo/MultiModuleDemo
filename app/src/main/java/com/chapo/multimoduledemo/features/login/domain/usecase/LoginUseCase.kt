package com.chapo.multimoduledemo.features.login.domain.usecase

import com.chapo.multimoduledemo.features.login.domain.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository
) {

    operator fun invoke(name: String) {
        loginRepository.login(name)
    }
}