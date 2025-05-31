package com.example.domain.usecase.game

import com.example.domain.model.Game
import com.example.domain.repository.GameRepo
import javax.inject.Inject

class CreateGameUseCase @Inject constructor(
    private val gameRepository: GameRepo
) {
    suspend operator fun invoke(game: Game) {
        gameRepository.addGame(game)
    }
}