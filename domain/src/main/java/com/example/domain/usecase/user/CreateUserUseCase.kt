package com.example.domain.usecase.user

import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(
    private val userRepository: UserRepo
) {
    suspend operator fun invoke(user: User) {
        userRepository.createUser(user)
    }
}
