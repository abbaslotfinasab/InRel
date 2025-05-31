package com.example.domain.model

import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.time.Duration

data class Occasion(
    val id: String,                            // Unique ID (UUID or DB ID)
    val userId: String,                        // Owner of the occasion
    val partnerId: String? = null,             // Optional - shared occasion
    val title: String,                         // e.g. "Birthday", "Anniversary"
    val description: String? = null,           // Optional text, like notes
    val date: LocalDate,                       // When is the occasion?
    val type: OccasionType,                    // Predefined or custom?
    val isRecurring: Boolean = false,          // Repeat yearly?
    val celebrated: Boolean = false,
    val giftSuggestions: List<Gift>?,
    val reminderOffset: Duration? = null,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null
)
