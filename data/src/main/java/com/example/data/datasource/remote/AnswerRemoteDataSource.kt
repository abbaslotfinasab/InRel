package com.example.data.datasource.remote

import com.example.core.constants.Constants
import com.example.data.dto.AnswerDto
import com.example.data.utile.RemoteHelper
import io.ktor.client.HttpClient
import io.ktor.client.request.*
import javax.inject.Inject
import io.ktor.http.*
import com.example.domain.utile.Result
import io.ktor.http.ContentType


class AnswerRemoteDataSource @Inject constructor(
    private val client: HttpClient,
    private val remoteHelper: RemoteHelper
) {

    suspend fun getAnswerById(id:String): Result<AnswerDto> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/answers/$id/")
        }
    }

    suspend fun getAnswersByUser(userId:String): Result<List<AnswerDto>> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/users/$userId/answers")
        }
    }


    suspend fun getAnswersByRelation(relId:String): Result<List<AnswerDto>> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/relations/$relId/answers")
        }
    }


    suspend fun getAnswersByQuestion(id:String): Result<List<AnswerDto>> {
        return remoteHelper.safeApiCall {
            client.get("${Constants.BASE_URL}/questions/$id/answers")
        }
    }

    suspend fun createAnswer(answerDto: AnswerDto): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.post("${Constants.BASE_URL}/answers") {
                contentType(ContentType.Application.Json)
                setBody(answerDto)
            }
        }
    }

    suspend fun updateAnswer(answerDto: AnswerDto): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.patch("${Constants.BASE_URL}/answers/${answerDto.id}") {
                contentType(ContentType.Application.Json)
                setBody(answerDto)
            }
        }
    }


    suspend fun deleteAnswer(answerId: String): Result<Unit> {
        return remoteHelper.safeApiCall {
            client.delete("${Constants.BASE_URL}/answers/$answerId")
        }
    }
}
