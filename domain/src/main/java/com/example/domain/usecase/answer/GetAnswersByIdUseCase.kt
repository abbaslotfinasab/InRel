package com.example.domain.usecase.answer

import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAnswersByIdUseCase @Inject constructor(
    private val answerRepository: AnswerRepo
) {
    operator fun invoke(id: String): Flow<Answer?> {
        return answerRepository.getAnswerById(id)
    }
}
