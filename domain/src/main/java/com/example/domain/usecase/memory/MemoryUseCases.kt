package com.example.domain.usecase.memory

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MemoryUseCases @Inject constructor(
    val addMemory: CreateMemoryUseCase,
    val getMemories: GetMemoriesUseCase,
    val deleteMemory: DeleteMemoryUseCase,
    val getMemoryById: GetMemoryByIdUseCase,
    val updateMemory: UpdateMemoryUseCase
)