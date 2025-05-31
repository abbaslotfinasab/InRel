package com.example.domain.usecase.conflict

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConflictUseCases @Inject constructor(
    val addConflict: CreateConflictUseCase,
    val getConflictByRelationIdUseCase: GetConflictByRelationIdUseCase,
    val getConflictByUserIdUseCase: GetConflictByUserIdUseCase,
    val getConflictByIdUseCase: GetConflictByIdUseCase,
    val updateConflict: UpdateConflictUseCase,
    val deleteConflict: DeleteConflictUseCase,
)
