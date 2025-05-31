package com.example.domain.repository

import com.example.domain.model.DateEvent
import kotlinx.coroutines.flow.Flow

interface DateEventRepo {
    suspend fun createDateEvent(event: DateEvent)
    suspend fun updateDateEvent(event: DateEvent)
    suspend fun deleteDateEvent(id: String)
    fun getDateEventById(id: String): Flow<DateEvent?>
    fun getDateEventsByRelationId(relationId: String): Flow<List<DateEvent>>
    fun getDateEventsByUserId(userId: String): Flow<List<DateEvent>>
}
