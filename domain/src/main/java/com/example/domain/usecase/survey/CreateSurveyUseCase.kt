package com.example.domain.usecase.survey

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateSurveyUseCase @Inject constructor(
    private val repository: SurveyRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Survey, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Survey) {
        return repository.submitSurvey(params)
    }
}