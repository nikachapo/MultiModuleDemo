package com.chapo.multimoduledemo.core.preferences

import android.content.SharedPreferences
import com.chapo.multimoduledemo.core.preferences.Preferences.Companion.KEY_NAME
import javax.inject.Inject

class PreferencesImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : Preferences {

    override fun saveUserName(name: String) {
        sharedPreferences
            .edit()
            .putString(KEY_NAME, name)
            .apply()
    }

    override fun deleteUserName() {
        sharedPreferences
            .edit()
            .putString(KEY_NAME, null)
            .apply()
    }
}