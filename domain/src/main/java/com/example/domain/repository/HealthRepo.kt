package com.example.domain.repository

import com.example.domain.model.HealthEntry
import kotlinx.coroutines.flow.Flow

interface HealthRepo {
    suspend fun createHealthEntry(entry: HealthEntry)
    suspend fun updateHealthEntry(entry: HealthEntry)
    suspend fun deleteHealthEntry(id: String)
    fun getHealthEntryById(id: String): Flow<HealthEntry?>
    fun getHealthEntriesByUserId(userId: String): Flow<List<HealthEntry>>
}
