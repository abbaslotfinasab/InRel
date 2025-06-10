package com.example.domain.usecase.conflict

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetConflictByUserIdUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<Conflict>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<Conflict> {
        return conflictRepository.getConflictByUserId(params)
    }
}
