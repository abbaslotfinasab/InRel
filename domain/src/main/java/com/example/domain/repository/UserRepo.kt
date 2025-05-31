package com.example.domain.repository

import com.example.domain.model.User
import kotlinx.coroutines.flow.Flow


interface UserRepo{
    fun getUsers(): Flow<MutableList<User>>
    fun getCurrentUser(id: String): Flow<User?>
    suspend fun createUser(user: User)
    suspend fun updateUser(user: User)
    suspend fun deleteUser(id: String)
}
