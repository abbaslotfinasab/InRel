package com.example.domain.usecase.conflict

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.ConflictRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteConflictUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: String) {
        conflictRepository.deleteConflict(params)
    }
}
