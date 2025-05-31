package com.example.domain.model

data class Survey(
    val id: String,
    val title: String,
    val description: String?,
    val isActive: Boolean = true,
    val createdAt: Long = System.currentTimeMillis(),
    val targetUserIds: List<String>? = null // اگه خاص باشه فقط برای یه عده خاص
)
