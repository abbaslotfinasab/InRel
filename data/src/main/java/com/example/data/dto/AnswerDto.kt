package com.example.data.dto

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class AnswerDto(
    val id: String,
    val questionId: String,
    val userId: String,
    val text: String,
    val createdAt: LocalDateTime?,
)
