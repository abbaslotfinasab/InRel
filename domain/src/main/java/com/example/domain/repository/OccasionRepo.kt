package com.example.domain.repository


import com.example.domain.model.Occasion
import kotlinx.coroutines.flow.Flow

interface OccasionRepo {
    suspend fun createOccasion(occasion: Occasion)
    suspend fun updateOccasion(occasion: Occasion)
    suspend fun deleteOccasion(id: String)
    fun getOccasionById(id: String): Occasion?
    fun getAllOccasions(): List<Occasion>
}
