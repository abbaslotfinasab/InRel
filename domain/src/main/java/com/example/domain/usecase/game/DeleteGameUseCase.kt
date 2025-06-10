package com.example.domain.usecase.game

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.GameRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteGameUseCase @Inject constructor(
    private val gameRepository: GameRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: String) {
        gameRepository.deleteGame(params)
    }
}
