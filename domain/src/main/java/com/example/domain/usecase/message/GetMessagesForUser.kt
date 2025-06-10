package com.example.domain.usecase.message

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMessagesForUser @Inject constructor(
    private val repository: ChatMessageRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<ChatMessage>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<ChatMessage> {
        return repository.getMessageByUserId(params)
    }
}