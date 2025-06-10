package com.example.domain.usecase.question

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class UpdateQuestionUseCase @Inject constructor(
    private val repository: QuestionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Question, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Question) {
        repository.updateQuestion(params)
    }
}
