package com.example.domain.usecase.answer

import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import javax.inject.Inject

class SubmitAnswerUseCase @Inject constructor(
    private val answerRepository: AnswerRepo
) {
    suspend operator fun invoke(answer: Answer) {
        answerRepository.submitAnswer(answer)
    }
}
