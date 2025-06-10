package com.example.domain.usecase.memory

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Memory
import com.example.domain.repository.MemoryRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteMemoryUseCase @Inject constructor (
    private val repository: MemoryRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        repository.deleteMemory(params)
    }
}