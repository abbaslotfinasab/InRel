package com.example.domain.repository

interface PreferenceRepo {

    suspend fun saveTheme(isDarkMode: Boolean)
    suspend fun getTheme(): Boolean

    suspend fun saveLanguage(languageCode: String)
    suspend fun getLanguage(): String

    suspend fun saveLoveLanguage(languageCode: String)
    suspend fun getLoveLanguage(): String

    suspend fun clearPreferences()

}