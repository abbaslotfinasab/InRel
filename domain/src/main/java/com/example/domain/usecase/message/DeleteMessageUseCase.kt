package com.example.domain.usecase.message

import com.example.domain.repository.ChatMessageRepo
import javax.inject.Inject

class DeleteMessageUseCase @Inject constructor(
    private val repository: ChatMessageRepo
) {
    suspend operator fun invoke(id: String) {
        return repository.deleteMessage(id)
    }
}