package com.example.domain.model

data class Notification(
    val id: String,
    val userId: String, // کسی که باید نوتیف بگیره
    val title: String,
    val message: String,
    val notificationType: NotificationType,
    val relatedToType: RelatedEntityType? = null,
    val relatedToId: String? = null,
    val isRead: Boolean = false,
    val timestamp: Long = System.currentTimeMillis()
)
