package com.example.domain.usecase.mood

import com.example.domain.model.Mood
import com.example.domain.repository.MoodRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllMoodsUseCase @Inject constructor(
    private val repository: MoodRepo
) {
    suspend operator fun invoke(): Flow<List<Mood>> {
        return repository.getAllMoods()
    }
}