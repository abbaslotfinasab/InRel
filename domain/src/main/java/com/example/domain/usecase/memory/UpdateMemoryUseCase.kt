package com.example.domain.usecase.memory

import com.example.domain.model.Memory
import com.example.domain.repository.MemoryRepo
import javax.inject.Inject

class UpdateMemoryUseCase @Inject constructor(
    private val repository: MemoryRepo
) {
    suspend operator fun invoke(memory: Memory) {
        repository.updateMemory(memory)
    }
}