package com.example.domain.usecase.event

import com.example.domain.model.DateEvent
import com.example.domain.repository.DateEventRepo
import javax.inject.Inject

class UpdateDateEventUseCase @Inject constructor(
    private val dateEventRepository: DateEventRepo
) {
    suspend operator fun invoke(event: DateEvent) {
        dateEventRepository.updateDateEvent(event)
    }
}
