package com.example.domain.usecase.message

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class SendMessageUseCase @Inject constructor(
    private val repository: ChatMessageRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<ChatMessage, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: ChatMessage) {
        repository.sendMessage(params)
    }
}
