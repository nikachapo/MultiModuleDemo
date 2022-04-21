package com.chapo.data.di

import com.chapo.data.LoginRepositoryImpl
import com.chapo.dom.LoginRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AuthDataModule {

    @Binds
    @ViewModelScoped
    abstract fun bindLoginRepo(repo: LoginRepositoryImpl): LoginRepository
}