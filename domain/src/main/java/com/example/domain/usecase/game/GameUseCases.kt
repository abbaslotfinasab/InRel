package com.example.domain.usecase.game

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GameUseCases @Inject constructor(
    val createGame: CreateGameUseCase,
    val getAllGames: GetAllGamesUseCase,
    val getGameById: GetGameByIdUseCase,
    val updateGame: UpdateGameUseCase,
    val deleteGame: DeleteGameUseCase,
)
