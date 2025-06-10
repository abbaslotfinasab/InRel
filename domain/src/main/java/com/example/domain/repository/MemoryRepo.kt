package com.example.domain.repository

import com.example.domain.model.Memory

interface MemoryRepo {
    suspend fun createMemory(memory: Memory)
    suspend fun updateMemory(memory: Memory)
    suspend fun deleteMemory(id: String)
    fun getMemoryById(id: String): Memory?
    fun getAllMemories(userId: String): List<Memory>
}
