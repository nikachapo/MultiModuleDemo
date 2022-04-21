package com.chapo.multimoduledemo.features.login.data.di

import com.chapo.multimoduledemo.features.login.data.LoginRepositoryImpl
import com.chapo.multimoduledemo.features.login.domain.LoginRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DataModule {

    @Binds
    @ViewModelScoped
    abstract fun bindLoginRepo(repo: LoginRepositoryImpl): LoginRepository
}