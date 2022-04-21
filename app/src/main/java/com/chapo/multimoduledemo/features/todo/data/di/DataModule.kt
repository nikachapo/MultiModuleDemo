package com.chapo.multimoduledemo.features.todo.data.di

import com.chapo.multimoduledemo.features.todo.data.TodoRepositoryImpl
import com.chapo.multimoduledemo.features.todo.data.remote.TodoApi
import com.chapo.multimoduledemo.features.todo.data.remote.TodoApiImpl
import com.chapo.multimoduledemo.features.todo.domain.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindApi(apiImpl: TodoApiImpl): TodoApi

    @Binds
    abstract fun bindRepo(repository: TodoRepositoryImpl): TodoRepository
}