package com.example.domain.usecase.mood

import com.example.domain.repository.MoodRepo
import javax.inject.Inject

class DeleteMoodUseCase @Inject constructor(
    private val repository: MoodRepo
) {
    suspend operator fun invoke(id: String) {
        repository.deleteMood(id)
    }
}