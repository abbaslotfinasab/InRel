package com.example.domain.usecase.notification

import com.example.domain.repository.NotificationRepo
import javax.inject.Inject

class DeleteNotificationUseCase @Inject constructor(
    private val repository: NotificationRepo
) {
    suspend operator fun invoke(notificationId: String) {
        repository.deleteNotification(notificationId)
    }
}
