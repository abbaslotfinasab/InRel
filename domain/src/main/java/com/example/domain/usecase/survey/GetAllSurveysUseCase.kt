package com.example.domain.usecase.survey

import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllSurveysUseCase  @Inject constructor(
    private val repository: SurveyRepo
) {
    suspend operator fun invoke(): Flow<List<Survey>> {
        return repository.getAllSurveys()
    }
}