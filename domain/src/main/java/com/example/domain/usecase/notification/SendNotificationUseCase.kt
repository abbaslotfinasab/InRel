package com.example.domain.usecase.notification

import com.example.domain.model.Notification
import com.example.domain.repository.NotificationRepo
import javax.inject.Inject

class SendNotificationUseCase @Inject constructor(
    private val repository: NotificationRepo
) {
    suspend operator fun invoke(notification: Notification) {
        repository.sendNotification(notification)
    }
}
