package com.example.domain.usecase.event

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.DateEvent
import com.example.domain.repository.DateEventRepo
import com.example.domain.usecase.BaseFlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDateEventsByUserIdUseCase @Inject constructor(
    private val dateEventRepository: DateEventRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, List<DateEvent>>(dispatcherProvider.io) {


    override suspend fun execute(params: String): List<DateEvent> {
        return dateEventRepository.getDateEventsByUserId(params)
    }
}
