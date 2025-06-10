package com.example.data.datasource.remote

import com.example.core.constants.Constants
import com.example.data.dto.UserDto
import com.example.data.utile.RemoteHelper
import com.example.domain.utile.Result
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.contentType
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserRemoteDataSource @Inject constructor(
    private val client: HttpClient,
    private val remoteHelper: RemoteHelper

) {


    suspend fun getAllUser(): Result<List<UserDto>> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/users/")
        }
    }

    suspend fun getCurrentUser(userId: String): Result<UserDto> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/users/$userId")
        }
    }

    suspend fun createUser(userDto: UserDto): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.post("${Constants.BASE_URL}/users/") {
                contentType(ContentType.Application.Json)
                setBody(userDto)
            }
        }
    }

    suspend fun updateUser(userDto: UserDto): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.patch("${Constants.BASE_URL}/users/${userDto.id}") {
                contentType(ContentType.Application.Json)
                setBody(userDto)
            }
        }
    }

    suspend fun deleteUser(id: String): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.delete("${Constants.BASE_URL}/users/$id")
        }
    }

}
