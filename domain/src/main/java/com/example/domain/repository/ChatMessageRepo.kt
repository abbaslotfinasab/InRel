package com.example.domain.repository

import com.example.domain.model.ChatMessage
import kotlinx.coroutines.flow.Flow

interface ChatMessageRepo {

    suspend fun sendMessage(message: ChatMessage)

    suspend fun getMessageByUserId(userId: String): Flow<List<ChatMessage>>

    suspend fun getMessagesForRelation(relationId: String): Flow<List<ChatMessage>>

    suspend fun getMessageById(id: String): Flow<ChatMessage?>

    suspend fun deleteMessage(id: String)

    suspend fun markMessageAsRead(id: String)

    suspend fun clearChat(relationId: String)

}