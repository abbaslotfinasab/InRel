package com.example.domain.usecase.occasion

import com.example.domain.repository.OccasionRepo
import javax.inject.Inject

class DeleteOccasionUseCase @Inject constructor(
    private val repository: OccasionRepo
) {
    suspend operator fun invoke(id: String) {
        repository.deleteOccasion(id)
    }
}