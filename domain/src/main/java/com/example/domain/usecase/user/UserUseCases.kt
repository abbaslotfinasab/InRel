package com.example.domain.usecase.user

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserUseCases @Inject constructor(
    val getAllUser: GetUsersUseCase,
    val getUser: GetCurrentUserUseCase,
    val createUser: CreateUserUseCase,
    val updateUser: UpdateUserUseCase,
    val deleteUser: DeleteUserUseCase
)