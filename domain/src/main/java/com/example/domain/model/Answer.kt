package com.example.domain.model

import java.time.LocalDateTime

data class Answer(
    val id: String,
    val questionId: String,
    val userId: String,
    val text: String,
    val answeredAt: LocalDateTime? = null
)
