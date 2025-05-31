package com.example.domain.model

data class ChatMessage(
    val id: String,
    val chatId: String,
    val senderId: String,
    val messageType: MessageType,
    val content: String?, // متن پیام یا لینک فایل
    val mediaUrl: String? = null, // اگه فایل‌باشه
    val repliedToMessageId: String? = null,
    val sentAt: Long = System.currentTimeMillis(),
    val deliveredAt: Long? = null,
    val seenAt: Long? = null,
    val isDeleted: Boolean = false,
    val isSystem: Boolean = false
)
