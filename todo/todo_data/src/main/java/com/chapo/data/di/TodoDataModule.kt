package com.chapo.data.di

import com.chapo.data.TodoRepositoryImpl
import com.chapo.data.remote.TodoApi
import com.chapo.data.remote.TodoApiImpl
import com.chapo.domain.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class TodoDataModule {

    @Binds
    abstract fun bindApi(apiImpl: TodoApiImpl): TodoApi

    @Binds
    abstract fun bindRepo(repository: TodoRepositoryImpl): TodoRepository
}