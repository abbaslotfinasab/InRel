package com.example.domain.usecase.occasion

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Occasion
import com.example.domain.repository.OccasionRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateOccasionUseCase @Inject constructor(
    private val repository: OccasionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Occasion, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: Occasion) {
        repository.createOccasion(params)
    }
}