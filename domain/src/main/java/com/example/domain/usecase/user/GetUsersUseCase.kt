package com.example.domain.usecase.user

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import com.example.domain.usecase.BaseFlowUseCase
import com.example.domain.utile.getOrThrow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<User>>(dispatcherProvider.io) {


    override suspend fun execute(params: Unit): List<User> {
        return userRepository.getUsers().getOrThrow()
    }
}