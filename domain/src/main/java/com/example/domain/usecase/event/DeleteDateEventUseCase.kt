package com.example.domain.usecase.event

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.DateEvent
import com.example.domain.repository.DateEventRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteDateEventUseCase @Inject constructor(
    private val dateEventRepository: DateEventRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: String) {
        dateEventRepository.deleteDateEvent(params)
    }
}
