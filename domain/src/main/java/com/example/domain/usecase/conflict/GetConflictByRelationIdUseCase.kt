package com.example.domain.usecase.conflict

import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetConflictByRelationIdUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo
) {
    suspend fun invoke(relationId: String): Flow<List<Conflict>> {
        return conflictRepository.getConflictsForRelation(relationId)
    }
}
