package com.example.domain.usecase.memory

import com.example.domain.model.Memory
import com.example.domain.repository.MemoryRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMemoriesUseCase @Inject constructor(
    private val repository: MemoryRepo
) {
    suspend operator fun invoke(userId: String): Flow<List<Memory>> {
        return repository.getAllMemories(userId)
    }
}