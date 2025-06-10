package com.example.domain.repository

import com.example.domain.model.Answer
import com.example.domain.utile.Result


interface AnswerRepo {
    suspend fun createAnswer(answer: Answer):Result<Unit>
    suspend fun updateAnswer(answer: Answer):Result<Unit>
    suspend fun deleteAnswer(id: String):Result<Unit>
    suspend fun getAnswerById(id: String): Result<Answer>
    suspend fun getAnswersByUser(userId: String): Result<List<Answer>>
    suspend fun getAnswersByRelation(relationId: String): Result<List<Answer>>
    suspend fun getAnswersByQuestion(questionId: String): Result<List<Answer>>
}
