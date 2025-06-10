package com.example.domain.usecase.occasion

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.OccasionRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteOccasionUseCase @Inject constructor(
    private val repository: OccasionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        repository.deleteOccasion(params)
    }
}