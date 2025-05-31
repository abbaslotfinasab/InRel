package com.example.domain.usecase.health

import com.example.domain.model.HealthEntry
import com.example.domain.repository.HealthRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetHealthEntryByIdUseCase @Inject constructor(
    private val healthRepository: HealthRepo
) {
    operator fun invoke(userId: String): Flow<HealthEntry?> {
        return healthRepository.getHealthEntryById(userId)
    }
}
