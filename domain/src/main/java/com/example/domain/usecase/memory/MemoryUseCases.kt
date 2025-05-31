package com.example.domain.usecase.memory

import javax.inject.Inject

class MemoryUseCases @Inject constructor(
    val addMemory: CreateMemoryUseCase,
    val getMemories: GetMemoriesUseCase,
    val deleteMemory: DeleteMemoryUseCase,
    val getMemoryById: GetMemoryByIdUseCase,
    val updateMemory: UpdateMemoryUseCase
)