package com.example.domain.usecase.message

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.ChatMessage
import com.example.domain.repository.ChatMessageRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetMessagesForRelation @Inject constructor(
    private val repository: ChatMessageRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<ChatMessage>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<ChatMessage> {
        return repository.getMessagesForRelation(params)
    }
}