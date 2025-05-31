package com.example.domain.model

data class ChatSession(
    val id: String,
    val user1Id: String,
    val user2Id: String,
    val createdAt: Long = System.currentTimeMillis(),
    val lastMessageId: String? = null,
    val lastUpdated: Long = System.currentTimeMillis()
)
