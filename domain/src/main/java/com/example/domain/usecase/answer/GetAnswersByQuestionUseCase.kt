package com.example.domain.usecase.answer

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import com.example.domain.usecase.BaseFlowUseCase
import com.example.domain.utile.getOrThrow
import javax.inject.Inject

class GetAnswersByQuestionUseCase @Inject constructor(
    private val answerRepository: AnswerRepo,
    dispatcherProvider: DispatcherProvider

) : BaseFlowUseCase<String, List<Answer>>(dispatcherProvider.io) {

    override suspend fun execute(params: String): List<Answer> {
        return answerRepository.getAnswersByQuestion(params).getOrThrow()
    }
}
