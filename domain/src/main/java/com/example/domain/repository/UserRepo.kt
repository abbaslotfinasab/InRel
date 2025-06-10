package com.example.domain.repository

import com.example.domain.model.User
import com.example.domain.utile.Result



interface UserRepo{
    suspend fun getUsers(): Result<List<User>>
    suspend fun getCurrentUser(id: String): Result<User>
    suspend fun createUser(user: User): Result<Unit>
    suspend fun updateUser(user: User): Result<Unit>
    suspend fun deleteUser(id: String): Result<Unit>
}
