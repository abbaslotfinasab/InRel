package com.example.domain.repository

import com.example.domain.model.ChatMessage

interface ChatMessageRepo {

    suspend fun sendMessage(message: ChatMessage)

    suspend fun getMessageByUserId(userId: String): List<ChatMessage>

    suspend fun getMessagesForRelation(relationId: String): List<ChatMessage>

    suspend fun getMessageById(id: String): ChatMessage?

    suspend fun deleteMessage(id: String)

    suspend fun markMessageAsRead(id: String)

    suspend fun clearChat(relationId: String)

}