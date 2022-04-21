package com.chapo.data

import com.chapo.core.preferences.Preferences
import com.chapo.dom.LoginRepository
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