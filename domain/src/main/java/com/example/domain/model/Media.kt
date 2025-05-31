package com.example.domain.model

data class Media(
    val id: String,
    val ownerId: String, // ID of uploader (usually a partner)
    val relatedToType: RelatedEntityType, // مثل CHAT یا CONFLICT
    val relatedToId: String, // آیدی اون آیتم مرتبط (مثلاً conflictId)
    val mediaType: MediaType,
    val url: String, // اگه توی Firebase ذخیره شه
    val localPath: String?, // برای حالت آفلاین
    val uploadedAt: Long,
    val description: String? = null // مثل "اسکرین‌شات بحثمون تو اینستاگرام"
)
