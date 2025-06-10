package com.example.domain.repository

import com.example.domain.model.Mood
import com.example.domain.model.MoodType
import kotlinx.coroutines.flow.Flow

interface MoodRepo {
    suspend fun createMood(mood: Mood)
    suspend fun updateMood(mood: Mood)
    suspend fun deleteMood(id: String)
    fun getMoodById(id: String): Mood?
    fun getAllMoods(): List<Mood>
}
