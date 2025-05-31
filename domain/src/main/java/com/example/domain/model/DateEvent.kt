package com.example.domain.model

import java.time.LocalDateTime

data class DateEvent(
    val id: String,                                  // Unique ID
    val title: String,                               // e.g. "Dinner at Italian Restaurant"
    val description: String? = null,                 // Optional details
    val location: String? = null,                    // e.g. "Rome Cafe, Tehran"
    val dateTime: LocalDateTime,                     // When it happened (or will happen)
    val isPlanned: Boolean = true,                   // Planned vs. spontaneous
    val isFavorite: Boolean = false,                 // Marked as special?
    val participants: List<String> = emptyList(),    // IDs of users involved
    val photos: List<String> = emptyList(),          // Optional image URLs
    val mood: MoodType? = null,                          // Optional enum (e.g. ROMANTIC, FUNNY, BAD)
    val tags: List<String> = emptyList()             // e.g. ["anniversary", "restaurant"]
)
