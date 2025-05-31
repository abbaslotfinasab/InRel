package com.example.domain.model

data class Preferences(
    val id: String,
    val userId: String,
    val language: String,
    val loveLanguage: LoveLanguage? = null,
    val theme: AppTheme = AppTheme.SYSTEM_DEFAULT,
    val updatedAt: Long = System.currentTimeMillis()
)
