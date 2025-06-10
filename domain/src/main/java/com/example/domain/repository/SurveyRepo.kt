package com.example.domain.repository

import com.example.domain.model.Survey
import kotlinx.coroutines.flow.Flow

interface SurveyRepo {

    suspend fun submitSurvey(survey: Survey)

    suspend fun getSurveyById(id: String):Survey?

    suspend fun getAllSurveys(): List<Survey>

    suspend fun deleteSurvey(id: String)

    suspend fun updateSurvey(survey: Survey)

}