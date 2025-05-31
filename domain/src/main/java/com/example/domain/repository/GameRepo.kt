package com.example.domain.repository


import com.example.domain.model.Game
import kotlinx.coroutines.flow.Flow

interface GameRepo{
    suspend fun addGame(game: Game)
    suspend fun updateGame(game: Game)
    suspend fun deleteGame(id: String)
    fun getGameById(id: String): Flow<Game?>
    fun getAllGames(): Flow<List<Game>>
    fun getGamesByUser(userId: String): Flow<List<Game>>
}
