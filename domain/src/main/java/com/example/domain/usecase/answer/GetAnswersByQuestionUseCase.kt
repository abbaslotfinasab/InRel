package com.example.domain.usecase.answer

import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAnswersByQuestionUseCase @Inject constructor(
    private val answerRepository: AnswerRepo
) {
    operator fun invoke(questionId: String): Flow<List<Answer>> {
        return answerRepository.getAnswersByQuestion(questionId)
    }
}
