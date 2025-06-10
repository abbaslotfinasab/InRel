package com.example.domain.usecase.question

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Question
import com.example.domain.repository.QuestionRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetAllQuestionsUseCase @Inject constructor(
    private val repository: QuestionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<Question>>(dispatcherProvider.io) {



    override suspend fun execute(params: Unit): List<Question> {
        return repository.getAllQuestions()
    }
}
