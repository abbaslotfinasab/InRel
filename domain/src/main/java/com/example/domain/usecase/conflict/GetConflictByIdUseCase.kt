package com.example.domain.usecase.conflict

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetConflictByIdUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Conflict?>(dispatcherProvider.io) {


    override suspend fun execute(params: String):Conflict? {
        return conflictRepository.getConflictById(params)
    }
}
