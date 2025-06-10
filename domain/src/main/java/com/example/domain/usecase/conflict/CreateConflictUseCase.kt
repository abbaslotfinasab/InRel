package com.example.domain.usecase.conflict

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateConflictUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo,
    dispatcherProvider: DispatcherProvider

) : BaseFlowUseCase<Conflict, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: Conflict) {
        conflictRepository.createConflict(params)
    }
}
