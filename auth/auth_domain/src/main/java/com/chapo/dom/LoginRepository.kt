package com.chapo.dom

interface LoginRepository {

    fun login(userName: String)
    fun logout()
}