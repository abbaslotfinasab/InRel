package com.example.domain.usecase.survey

import com.example.domain.repository.SurveyRepo
import javax.inject.Inject

class DeleteSurveyUseCase @Inject constructor(
    private val repository: SurveyRepo
) {
    suspend operator fun invoke(id: String): Boolean {
        return repository.deleteSurvey(id)
    }
}