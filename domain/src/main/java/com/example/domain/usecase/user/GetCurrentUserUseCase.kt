package com.example.domain.usecase.user

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import com.example.domain.usecase.BaseFlowUseCase
import com.example.domain.utile.getOrThrow
import javax.inject.Inject

class GetCurrentUserUseCase @Inject constructor(
    private val userRepository: UserRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, User>(dispatcherProvider.io) {


    override suspend fun execute(params: String): User {
        return userRepository.getCurrentUser(params).getOrThrow()
    }
}