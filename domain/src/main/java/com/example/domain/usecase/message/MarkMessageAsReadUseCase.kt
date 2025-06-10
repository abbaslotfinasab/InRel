package com.example.domain.usecase.message

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.ChatMessageRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class MarkMessageAsReadUseCase @Inject constructor(
    private val repository: ChatMessageRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io)
{

    override suspend fun execute(params: String) {
        return repository.markMessageAsRead(params)
    }
}