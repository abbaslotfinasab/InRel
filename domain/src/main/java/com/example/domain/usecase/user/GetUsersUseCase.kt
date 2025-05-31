package com.example.domain.usecase.user

import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepo

) {
    operator fun invoke() : Flow<MutableList<User>> {
        return userRepository.getUsers()
    }
}