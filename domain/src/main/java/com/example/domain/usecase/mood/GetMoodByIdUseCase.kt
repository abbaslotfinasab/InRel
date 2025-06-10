package com.example.domain.usecase.mood

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Mood
import com.example.domain.repository.MoodRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetMoodByIdUseCase @Inject constructor(
    private val repository: MoodRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Mood?>(dispatcherProvider.io) {

    override suspend fun execute(params: String): Mood? {
        return repository.getMoodById(params)
    }
}