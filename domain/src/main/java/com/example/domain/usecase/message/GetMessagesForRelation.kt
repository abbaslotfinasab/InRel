package com.example.domain.usecase.message

import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMessagesForRelation @Inject constructor(
    private val repository: ChatMessageRepo
) {
    suspend operator fun invoke(relationId: String): Flow<List<ChatMessage>> {
        return repository.getMessagesForRelation(relationId)
    }
}