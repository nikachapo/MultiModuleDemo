package com.chapo.multimoduledemo.core.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.chapo.multimoduledemo.core.preferences.Preferences
import com.chapo.multimoduledemo.core.preferences.PreferencesImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {

    @Binds
    abstract fun bindPreferences(prefs: PreferencesImpl): Preferences

    companion object {
        @Provides
        @Singleton
        fun provideSharedPrefs(context: Application): SharedPreferences {
            return context.getSharedPreferences("mm", MODE_PRIVATE)
        }
    }
}