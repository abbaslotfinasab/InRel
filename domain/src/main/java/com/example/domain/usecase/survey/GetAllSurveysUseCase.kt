package com.example.domain.usecase.survey

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllSurveysUseCase  @Inject constructor(
    private val repository: SurveyRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<Survey>>(dispatcherProvider.io) {


    override suspend fun execute(params: Unit): List<Survey> {
        return repository.getAllSurveys()
    }
}