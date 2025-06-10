package com.example.domain.usecase.notification

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Notification
import com.example.domain.repository.NotificationRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotificationsUseCase @Inject constructor(
    private val repository: NotificationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<Notification>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<Notification> {
        return repository.getAllNotifications()
    }
}
