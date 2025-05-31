package com.example.domain.usecase.mood

import com.example.domain.model.Mood
import com.example.domain.repository.MoodRepo
import javax.inject.Inject

class UpdateMoodUseCase @Inject constructor(
    private val repository: MoodRepo
) {
    suspend operator fun invoke(mood: Mood) {
        repository.updateMood(mood)
    }
}