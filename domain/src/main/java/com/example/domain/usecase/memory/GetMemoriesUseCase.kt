package com.example.domain.usecase.memory

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Memory
import com.example.domain.repository.MemoryRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMemoriesUseCase @Inject constructor(
    private val repository: MemoryRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<Memory>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<Memory> {
        return repository.getAllMemories(params)
    }
}