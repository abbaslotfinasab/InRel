package com.example.domain.usecase.health

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.HealthRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteHealthRecordUseCase @Inject constructor(
    private val healthRepository: HealthRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        healthRepository.deleteHealthEntry(params)
    }
}
