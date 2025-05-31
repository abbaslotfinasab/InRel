package com.example.domain.usecase.game

import com.example.domain.model.Game
import com.example.domain.repository.GameRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllGamesUseCase @Inject constructor(
    private val gameRepository: GameRepo
) {
    operator fun invoke(): Flow<List<Game>> {
        return gameRepository.getAllGames()
    }
}
