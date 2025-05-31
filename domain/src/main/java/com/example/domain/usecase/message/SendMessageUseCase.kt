package com.example.domain.usecase.message

import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import javax.inject.Inject

class SendMessageUseCase @Inject constructor(
    private val repository: ChatMessageRepo
) {
    suspend operator fun invoke(message: ChatMessage) {
        repository.sendMessage(message)
    }
}
