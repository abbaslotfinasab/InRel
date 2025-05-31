package com.example.domain.usecase.occasion

import com.example.domain.model.Occasion
import com.example.domain.repository.OccasionRepo
import javax.inject.Inject

class CreateOccasionUseCase @Inject constructor(
    private val repository: OccasionRepo
) {
    suspend operator fun invoke(occasion: Occasion) {
        repository.createOccasion(occasion)
    }
}