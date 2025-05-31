package com.example.domain.usecase.conflict

import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetConflictByUserIdUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo
) {
    suspend fun invoke(userId: String): Flow<List<Conflict>> {
        return conflictRepository.getConflictByUserId(userId)
    }
}
