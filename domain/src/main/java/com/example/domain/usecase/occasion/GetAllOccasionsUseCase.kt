package com.example.domain.usecase.occasion

import com.example.domain.model.Occasion
import com.example.domain.repository.OccasionRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllOccasionsUseCase @Inject constructor(
    private val repository: OccasionRepo
) {
    suspend operator fun invoke(): Flow<List<Occasion>> {
        return repository.getAllOccasions()
    }
}