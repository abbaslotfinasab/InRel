package com.example.data.repository

import com.example.data.datasource.remote.AnswerRemoteDataSource
import com.example.data.mapper.toDomain
import com.example.data.mapper.toDto
import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import com.example.domain.utile.Result
import javax.inject.Inject

class AnswerRepositoryImpl @Inject constructor(
    private val remoteDataSource: AnswerRemoteDataSource
) : AnswerRepo {

    override suspend fun createAnswer(answer: Answer): Result<Unit> {
        return remoteDataSource.createAnswer(answer.toDto())
    }

    override suspend fun updateAnswer(answer: Answer): Result<Unit> {
        return remoteDataSource.updateAnswer(answer.toDto())
    }

    override suspend fun deleteAnswer(id: String): Result<Unit>  {
        return remoteDataSource.deleteAnswer(id)
    }

    override suspend fun getAnswerById(id: String): Result<Answer> {
        return remoteDataSource.getAnswerById(id).map {it.toDomain()}
    }

    override suspend fun getAnswersByUser(userId: String): Result<List<Answer>> {
        return remoteDataSource.getAnswersByUser(userId).map {listDto ->
            listDto.map { it.toDomain() }}
    }

    override suspend fun getAnswersByRelation(relationId: String): Result<List<Answer>> {
        return remoteDataSource.getAnswersByRelation(relationId).map {listDto ->
            listDto.map { it.toDomain() }}
    }

    override suspend fun getAnswersByQuestion(questionId: String): Result<List<Answer>> {
        return remoteDataSource.getAnswersByQuestion(questionId).map {listDto ->
            listDto.map { it.toDomain() }}
    }
}
