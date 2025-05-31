package com.example.domain.model

import java.time.LocalDate

data class Relation(
    val id: String,                        // Unique ID
    val userId1: String,                   // یکی از طرفین رابطه
    val userId2: String,                   // طرف دیگه
    val startDate: LocalDate,             // از کی باهمن؟
    val status: RelationStatus,           // وضعیت رابطه
    val isFavorite: Boolean = false,      // برای مشخص کردن رابطه اصلی (اگه چندتا بود 😬)
    val anniversaryDate: LocalDate? = null, // سالگرد رابطه
    val notes: String? = null             // هر چی دل تنگت می‌خواد...
)
