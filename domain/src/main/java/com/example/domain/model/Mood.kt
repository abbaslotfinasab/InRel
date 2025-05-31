package com.example.domain.model

data class Mood(
    val id: String,
    val userId: String,
    val moodType: MoodType,
    val intensity: Int, // 0 تا 10 مثلا
    val note: String? = null, // توضیح شخصی مثل "سر کار اعصابم خورد شد"
    val timestamp: Long,
    val relatedToType: RelatedEntityType? = null,
    val relatedToId: String? = null
)
