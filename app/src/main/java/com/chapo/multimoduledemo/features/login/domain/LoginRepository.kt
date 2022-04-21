package com.chapo.multimoduledemo.features.login.domain

interface LoginRepository {

    fun login(userName: String)
    fun logout()
}