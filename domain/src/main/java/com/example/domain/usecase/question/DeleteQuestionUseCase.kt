package com.example.domain.usecase.question

import com.example.domain.repository.QuestionRepo
import javax.inject.Inject


class DeleteQuestionUseCase @Inject constructor(
    private val repository: QuestionRepo
) {
    suspend operator fun invoke(id: String) {
        repository.deleteQuestion(id)
    }
}
