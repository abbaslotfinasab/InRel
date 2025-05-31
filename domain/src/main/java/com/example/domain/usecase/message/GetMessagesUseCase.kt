package com.example.domain.usecase.message

import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMessagesUseCase @Inject constructor(
    private val repository: ChatMessageRepo
) {
    suspend operator fun invoke(conversationId: String): Flow<ChatMessage?> {
        return repository.getMessageById(conversationId)
    }
}
