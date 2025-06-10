package com.example.domain.usecase.game

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Game
import com.example.domain.repository.GameRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(
    private val gameRepository: GameRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Game?>(dispatcherProvider.io) {


    override suspend fun execute(params: String): Game? {
        return gameRepository.getGameById(params)
    }
}
