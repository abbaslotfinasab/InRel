package com.example.domain.repository


import com.example.domain.model.Question
import kotlinx.coroutines.flow.Flow

interface QuestionRepo {
    suspend fun createQuestion(question: Question)
    suspend fun updateQuestion(question: Question)
    suspend fun deleteQuestion(id: String)
    fun getQuestionById(id: String): Question?
    fun getAllQuestions(): List<Question>
}
