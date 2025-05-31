package com.example.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

data class Memory(
    val id: String,                               // Unique ID (UUID or Firestore doc ID)
    val userId: String,                           // Owner of the memory
    val partnerId: String? = null,                // Optional - if shared
    val title: String,                            // e.g. "Our first trip"
    val description: String? = null,              // Text or note about the memory
    val mediaUrls: List<String> = emptyList(),    // URLs to photos/videos
    val location: GeoLocation? = null,            // Where it happened (optional)
    val tags: List<String> = emptyList(),         // Custom tags like #trip, #fun
    val date: LocalDate,                          // When it happened
    val isPrivate: Boolean = false,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null,
)
