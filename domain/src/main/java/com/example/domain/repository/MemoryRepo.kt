package com.example.domain.repository

import com.example.domain.model.Memory
import kotlinx.coroutines.flow.Flow

interface MemoryRepo {
    suspend fun createMemory(memory: Memory)
    suspend fun updateMemory(memory: Memory)
    suspend fun deleteMemory(id: String)
    fun getMemoryById(id: String): Flow<Memory?>
    fun getAllMemories(): Flow<List<Memory>>
}
