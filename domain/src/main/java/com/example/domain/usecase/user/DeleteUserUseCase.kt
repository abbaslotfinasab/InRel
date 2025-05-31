package com.example.domain.usecase.user

import com.example.domain.repository.UserRepo
import javax.inject.Inject

class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepo
) {
    suspend operator fun invoke(userId: String) {
        userRepository.deleteUser(userId)
    }
}
