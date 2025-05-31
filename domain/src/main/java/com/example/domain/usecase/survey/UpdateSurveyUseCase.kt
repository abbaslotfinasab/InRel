package com.example.domain.usecase.survey

import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import javax.inject.Inject

class UpdateSurveyUseCase @Inject constructor(
    private val repository: SurveyRepo
) {
    suspend operator fun invoke(survey: Survey): Boolean {
        return repository.updateSurvey(survey)
    }
}