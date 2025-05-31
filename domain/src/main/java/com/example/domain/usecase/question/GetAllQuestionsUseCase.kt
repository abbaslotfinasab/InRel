package com.example.domain.usecase.question

import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetAllQuestionsUseCase @Inject constructor(
    private val repository: QuestionRepo
) {
    suspend operator fun invoke(): Flow<List<Question>> {
        return repository.getAllQuestions()
    }
}
