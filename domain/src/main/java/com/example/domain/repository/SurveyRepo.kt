package com.example.domain.repository

import com.example.domain.model.Survey
import kotlinx.coroutines.flow.Flow

interface SurveyRepo {

    suspend fun submitSurvey(survey: Survey): Boolean

    suspend fun getSurveyById(id: String): Flow<Survey?>

    suspend fun getAllSurveys(): Flow<List<Survey>>

    suspend fun deleteSurvey(id: String): Boolean

    suspend fun updateSurvey(survey: Survey): Boolean

}