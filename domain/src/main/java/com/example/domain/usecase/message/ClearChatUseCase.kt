package com.example.domain.usecase.message

import com.example.domain.repository.ChatMessageRepo
import javax.inject.Inject

class ClearChatUseCase @Inject constructor(
    private val repository: ChatMessageRepo
) {
    suspend operator fun invoke(conversationId: String) {
        return repository.clearChat(conversationId)
    }
}