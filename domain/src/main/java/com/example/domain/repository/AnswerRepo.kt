package com.example.domain.repository

import com.example.domain.model.Answer
import kotlinx.coroutines.flow.Flow

interface AnswerRepo {
    suspend fun addAnswer(answer: Answer)
    suspend fun updateAnswer(answer: Answer)
    suspend fun deleteAnswer(id: String)
    fun getAnswerById(id: String): Flow<Answer?>
    fun getAnswersByUser(userId: String): Flow<List<Answer>>
    fun getAnswersByQuestion(questionId: String): Flow<List<Answer>>
}
