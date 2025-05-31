package com.example.domain.usecase.answer

import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAnswersByUserUseCase @Inject constructor(
    private val answerRepository: AnswerRepo
) {
    operator fun invoke(userId: String): Flow<List<Answer>> {
        return answerRepository.getAnswersByUser(userId)
    }
}
