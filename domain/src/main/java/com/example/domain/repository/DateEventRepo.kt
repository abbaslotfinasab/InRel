package com.example.domain.repository

import com.example.domain.model.DateEvent
import kotlinx.coroutines.flow.Flow

interface DateEventRepo {
    suspend fun addDateEvent(event: DateEvent)
    suspend fun updateDateEvent(event: DateEvent)
    suspend fun deleteDateEvent(id: String)
    fun getDateEventById(id: String): Flow<DateEvent?>
    fun getAllDateEvents(): Flow<List<DateEvent>>
    fun getDateEventsByUser(userId: String): Flow<List<DateEvent>>
}
