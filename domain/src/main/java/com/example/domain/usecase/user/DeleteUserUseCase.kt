package com.example.domain.usecase.user

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.UserRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        userRepository.deleteUser(params)
    }
}
