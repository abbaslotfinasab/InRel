package com.example.domain.usecase.health

import com.example.domain.model.HealthEntry
import com.example.domain.repository.HealthRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetHealthRecordsUseCase @Inject constructor(
    private val healthRepository: HealthRepo
) {
    operator fun invoke(userId: String): Flow<List<HealthEntry>> {
        return healthRepository.getHealthEntriesByUserId(userId)
    }
}
