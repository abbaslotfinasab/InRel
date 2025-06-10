package com.example.domain.usecase.question

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject


class GetQuestionByIdUseCase @Inject constructor(
    private val repository: QuestionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Question?>(dispatcherProvider.io) {


    override suspend fun execute(params: String): Question? {
        return repository.getQuestionById(params)
    }
}
