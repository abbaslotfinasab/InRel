package com.example.domain.usecase.survey

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Request
import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSurveyByIdUseCase @Inject constructor(
    private val repository: SurveyRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Survey?>(dispatcherProvider.io) {


    override suspend fun execute(params: String): Survey? {
        return repository.getSurveyById(params)
    }
}