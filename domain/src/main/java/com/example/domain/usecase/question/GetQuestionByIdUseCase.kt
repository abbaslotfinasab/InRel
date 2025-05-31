package com.example.domain.usecase.question

import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetQuestionByIdUseCase @Inject constructor(
    private val repository: QuestionRepo
) {
    suspend operator fun invoke(id: String): Flow<Question?> {
        return repository.getQuestionById(id)
    }
}
