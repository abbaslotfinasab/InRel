package com.example.domain.usecase.notification

import com.example.domain.model.Notification
import com.example.domain.repository.NotificationRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotificationsUseCase @Inject constructor(
    private val repository: NotificationRepo
) {
    suspend operator fun invoke(): Flow<List<Notification>> {
        return repository.getAllNotifications()
    }
}
