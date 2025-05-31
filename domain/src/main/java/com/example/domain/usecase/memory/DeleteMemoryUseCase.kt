package com.example.domain.usecase.memory

import com.example.domain.repository.MemoryRepo
import javax.inject.Inject

class DeleteMemoryUseCase @Inject constructor (
    private val repository: MemoryRepo
) {
    suspend operator fun invoke(memoryId: String) {
        repository.deleteMemory(memoryId)
    }
}