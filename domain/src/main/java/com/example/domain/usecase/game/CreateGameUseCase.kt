package com.example.domain.usecase.game

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Game
import com.example.domain.repository.GameRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateGameUseCase @Inject constructor(
    private val gameRepository: GameRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Game, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: Game) {
        gameRepository.addGame(params)
    }
}