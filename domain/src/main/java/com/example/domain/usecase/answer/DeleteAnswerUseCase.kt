package com.example.domain.usecase.answer

import com.example.domain.repository.AnswerRepo
import javax.inject.Inject

class DeleteAnswerUseCase @Inject constructor(
    private val answerRepository: AnswerRepo
) {
    suspend operator fun invoke(id: String) {
        answerRepository.deleteAnswer(id)
    }
}
