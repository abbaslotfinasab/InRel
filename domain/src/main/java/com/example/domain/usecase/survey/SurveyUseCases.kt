package com.example.domain.usecase.survey

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SurveyUseCases @Inject constructor(
    val submitSurvey: CreateSurveyUseCase,
    val getSurveyById: GetSurveyByIdUseCase,
    val getAllSurveys: GetAllSurveysUseCase,
    val deleteSurvey: DeleteSurveyUseCase,
    val updateSurvey: UpdateSurveyUseCase,

    )