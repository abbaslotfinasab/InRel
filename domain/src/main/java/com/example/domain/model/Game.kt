package com.example.domain.model

import java.time.LocalDateTime

data class Game(
    val id: String,
    val title: String,
    val description: String,
    val type: GameType,
    val createdAt: LocalDateTime? = null,
    val playedAt: LocalDateTime? = null,
    val isCompleted: Boolean = false,
    val score: Int? = null, // اختیاری، برای بازی‌های امتیازی
)
