package com.example.core.di

import com.example.core.utile.DateFormatter
import com.example.core.utile.DefaultTimeProvider
import com.example.core.utile.TimeProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UtilsModule {

    @Provides
    @Singleton
    fun provideDateFormatter(): DateFormatter = DateFormatter()


    @Provides
    @Singleton
    fun provideTimeProvider(): TimeProvider = DefaultTimeProvider()
}