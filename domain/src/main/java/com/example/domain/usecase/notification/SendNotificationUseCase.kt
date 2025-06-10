package com.example.domain.usecase.notification

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Notification
import com.example.domain.repository.NotificationRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class SendNotificationUseCase @Inject constructor(
    private val repository: NotificationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Notification, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Notification) {
        repository.sendNotification(params)
    }
}
