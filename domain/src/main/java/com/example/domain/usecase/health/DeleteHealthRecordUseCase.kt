package com.example.domain.usecase.health

import com.example.domain.repository.HealthRepo
import javax.inject.Inject

class DeleteHealthRecordUseCase @Inject constructor(
    private val healthRepository: HealthRepo
) {
    suspend operator fun invoke(id: String) {
        healthRepository.deleteHealthEntry(id)
    }
}
