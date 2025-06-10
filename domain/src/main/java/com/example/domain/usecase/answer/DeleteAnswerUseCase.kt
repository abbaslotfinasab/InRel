package com.example.domain.usecase.answer

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.AnswerRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject


class DeleteAnswerUseCase @Inject constructor(
    private val answerRepository: AnswerRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: String){
        answerRepository.deleteAnswer(params)
    }
}
