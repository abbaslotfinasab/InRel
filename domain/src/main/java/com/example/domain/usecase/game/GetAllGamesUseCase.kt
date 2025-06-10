package com.example.domain.usecase.game

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Game
import com.example.domain.repository.GameRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetAllGamesUseCase @Inject constructor(
    private val gameRepository: GameRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<Game>>(dispatcherProvider.io) {


    override suspend fun execute(params: Unit): List<Game> {
        return gameRepository.getAllGames()
    }
}
