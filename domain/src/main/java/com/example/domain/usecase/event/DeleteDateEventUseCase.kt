package com.example.domain.usecase.event

import com.example.domain.repository.DateEventRepo
import javax.inject.Inject

class DeleteDateEventUseCase @Inject constructor(
    private val dateEventRepository: DateEventRepo
) {
    suspend operator fun invoke(id: String) {
        dateEventRepository.deleteDateEvent(id)
    }
}
