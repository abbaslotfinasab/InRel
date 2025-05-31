package com.example.domain.usecase.survey

import com.example.domain.model.Survey
import com.example.domain.repository.SurveyRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSurveyByIdUseCase @Inject constructor(
    private val repository: SurveyRepo
) {
    suspend operator fun invoke(id: String): Flow<Survey?> {
        return repository.getSurveyById(id)
    }
}