package com.example.domain.usecase.answer

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Answer
import com.example.domain.repository.AnswerRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class UpdateAnswerUseCase @Inject constructor(
    private val answerRepository: AnswerRepo,
    dispatcherProvider: DispatcherProvider

) : BaseFlowUseCase<Answer, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: Answer){
        answerRepository.updateAnswer(params)
    }
}
