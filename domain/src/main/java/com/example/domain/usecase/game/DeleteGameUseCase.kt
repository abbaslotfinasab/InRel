package com.example.domain.usecase.game

import com.example.domain.repository.GameRepo
import javax.inject.Inject

class DeleteGameUseCase @Inject constructor(
    private val gameRepository: GameRepo
) {
    suspend operator fun invoke(id: String) {
        gameRepository.deleteGame(id)
    }
}
