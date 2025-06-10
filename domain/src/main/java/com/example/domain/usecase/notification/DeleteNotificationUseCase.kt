package com.example.domain.usecase.notification

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Mood
import com.example.domain.repository.NotificationRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteNotificationUseCase @Inject constructor(
    private val repository: NotificationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        repository.deleteNotification(params)
    }
}
