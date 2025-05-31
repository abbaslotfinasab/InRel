package com.example.domain.model

import java.time.LocalDateTime

data class Gift(
    val id: String,                              // Unique ID
    val giverId: String,                         // Who gave the gift
    val receiverId: String,                      // Who received it
    val relationId: String,                      // Who received it
    val title: String,                           // Gift title e.g. "Teddy Bear"
    val description: String? = null,             // Optional note
    val imageUrl: String? = null,                // Photo of the gift
    val dateGiven: LocalDateTime?= null,
    val occasion: String? = null,                // Birthday, Anniversary, etc.
    val price: Double? = null,                   // Optional
    val isSurprise: Boolean = false,              // Was it a surprise gift?

    val type: GiftType = GiftType.PHYSICAL

)
