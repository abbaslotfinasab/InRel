package com.example.domain.repository

import com.example.domain.model.Conflict
import kotlinx.coroutines.flow.Flow

interface ConflictRepo {
    suspend fun createConflict(conflict: Conflict)

    suspend fun getConflictsForRelation(relationId: String): Flow<List<Conflict>>

    suspend fun getConflictById(id: String): Flow<Conflict?>

    suspend fun resolveConflict(id: String, resolutionNote: String)

    suspend fun deleteConflict(id: String)
}