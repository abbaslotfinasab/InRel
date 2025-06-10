package com.example.domain.usecase.mood

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.MoodRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteMoodUseCase @Inject constructor(
    private val repository: MoodRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {



    override suspend fun execute(params: String) {
        repository.deleteMood(params)
    }
}