package com.example.domain.usecase.user

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(
    private val userRepository: UserRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<User, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: User) {
        userRepository.createUser(params)
    }
}
