package com.example.data.di

import com.example.data.repository.AnswerRepositoryImpl
import com.example.data.repository.UserRepositoryImpl
import com.example.domain.repository.AnswerRepo
import com.example.domain.repository.UserRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(
        impl: UserRepositoryImpl
    ): UserRepo


    @Binds
    abstract fun bindAnswerRepository(
        impl: AnswerRepositoryImpl
    ): AnswerRepo


}
