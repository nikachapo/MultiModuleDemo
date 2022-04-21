package com.chapo.multimoduledemo.features.login.data

import com.chapo.multimoduledemo.core.preferences.Preferences
import com.chapo.multimoduledemo.features.login.domain.LoginRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


@Module
@InstallIn(SingletonComponent::class)
class LoginRepositoryImpl @Inject constructor(
    private val preferences: Preferences
) : LoginRepository {

    override fun login(userName: String) {
        preferences.saveUserName(userName)
    }

    override fun logout() {
        preferences.deleteUserName()
    }

}