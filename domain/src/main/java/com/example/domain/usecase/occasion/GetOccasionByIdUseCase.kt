package com.example.domain.usecase.occasion

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Occasion
import com.example.domain.repository.OccasionRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetOccasionByIdUseCase @Inject constructor(
    private val repository: OccasionRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Occasion?>(dispatcherProvider.io) {

    override suspend fun execute(params: String): Occasion? {
        return repository.getOccasionById(params)
    }
}