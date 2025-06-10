package com.example.domain.repository

import com.example.domain.model.Notification
import kotlinx.coroutines.flow.Flow

interface NotificationRepo {

    suspend fun sendNotification(notification: Notification)

    suspend fun getNotificationsForUser(userId: String): List<Notification>

    suspend fun getAllNotifications(): List<Notification>

    suspend fun markAsRead(notificationId: String)

    suspend fun deleteNotification(notificationId: String)

    suspend fun clearAllNotifications(userId: String)
}