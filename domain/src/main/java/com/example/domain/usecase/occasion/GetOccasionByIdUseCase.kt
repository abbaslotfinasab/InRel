package com.example.domain.usecase.occasion

import com.example.domain.model.Occasion
import com.example.domain.repository.OccasionRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetOccasionByIdUseCase @Inject constructor(
    private val repository: OccasionRepo

) {
    suspend operator fun invoke(id: String): Flow<Occasion?> {
        return repository.getOccasionById(id)
    }
}