package com.example.domain.usecase.notification

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NotificationUseCases @Inject constructor(
    val sendNotification: SendNotificationUseCase,
    val getAllNotifications: GetAllNotificationsUseCase,
    val getNotificationsForUserUseCase: GetNotificationsForUserUseCase,
    val markNotificationAsRead: MarkNotificationAsReadUseCase,
    val deleteNotification: DeleteNotificationUseCase
)