package com.example.data.repository

import com.example.data.datasource.remote.UserRemoteDataSource
import com.example.data.mapper.toDomain
import com.example.data.mapper.toDto
import com.example.domain.model.User
import com.example.domain.repository.UserRepo
import javax.inject.Inject
import com.example.domain.utile.Result
import javax.inject.Singleton


@Singleton
class UserRepositoryImpl @Inject constructor(
    private val remoteDataSource: UserRemoteDataSource
) : UserRepo{

    override suspend fun getUsers(): Result<List<User>> {
        return remoteDataSource.getAllUser().map { listDto ->
            listDto.map { it.toDomain() }
        }
    }

    override suspend fun getCurrentUser(id: String): Result<User>  {
        return remoteDataSource.getCurrentUser(id).map {it.toDomain()}
    }

    override suspend fun createUser(user: User):Result<Unit> {
        return remoteDataSource.createUser(user.toDto())
    }

    override suspend fun updateUser(user: User): Result<Unit> {
        return remoteDataSource.updateUser(user.toDto())
    }

    override suspend fun deleteUser(id: String): Result<Unit> {
        return remoteDataSource.deleteUser(id)
    }
}
