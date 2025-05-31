package com.example.domain.usecase.question

import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import javax.inject.Inject

class UpdateQuestionUseCase @Inject constructor(
    private val repository: QuestionRepo
) {
    suspend operator fun invoke(question: Question) {
        repository.updateQuestion(question)
    }
}
