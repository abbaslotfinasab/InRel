package com.example.domain.usecase.memory

import com.example.domain.model.Memory
import com.example.domain.repository.MemoryRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMemoryByIdUseCase @Inject constructor(
    private val repository: MemoryRepo
) {
    suspend operator fun invoke(memoryId: String): Flow<Memory?> {
        return repository.getMemoryById(memoryId)
    }
}
