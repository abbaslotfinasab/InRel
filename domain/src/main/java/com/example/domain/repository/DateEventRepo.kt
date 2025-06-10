package com.example.domain.repository

import com.example.domain.model.DateEvent
import kotlinx.coroutines.flow.Flow

interface DateEventRepo {
    suspend fun createDateEvent(event: DateEvent)
    suspend fun updateDateEvent(event: DateEvent)
    suspend fun deleteDateEvent(id: String)
    fun getDateEventById(id: String): DateEvent?
    fun getDateEventsByRelationId(relationId: String): List<DateEvent>
    fun getDateEventsByUserId(userId: String): List<DateEvent>
}
