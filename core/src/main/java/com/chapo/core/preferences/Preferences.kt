package com.chapo.core.preferences

interface Preferences {

    fun saveUserName(name: String)
    fun deleteUserName()

    companion object {
       const val KEY_NAME = "key_name"
    }
}