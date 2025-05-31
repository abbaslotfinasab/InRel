package com.example.domain.usecase.health

import com.example.domain.model.HealthEntry
import com.example.domain.repository.HealthRepo
import javax.inject.Inject

class CreateHealthRecordUseCase @Inject constructor(
    private val healthRepository: HealthRepo
) {
    suspend operator fun invoke(health: HealthEntry) {
        healthRepository.createHealthEntry(health)
    }
}
