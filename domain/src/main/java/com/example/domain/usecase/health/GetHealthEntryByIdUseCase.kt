package com.example.domain.usecase.health

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.HealthEntry
import com.example.domain.repository.HealthRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetHealthEntryByIdUseCase @Inject constructor(
    private val healthRepository: HealthRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, HealthEntry?>(dispatcherProvider.io) {

    override suspend fun execute(params: String): HealthEntry? {
        return healthRepository.getHealthEntryById(params)
    }
}
