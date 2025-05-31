package com.example.domain.usecase.conflict

import com.example.domain.model.Conflict
import com.example.domain.repository.ConflictRepo
import javax.inject.Inject

class CreateConflictUseCase @Inject constructor(
    private val conflictRepository: ConflictRepo
) {
    suspend operator fun invoke(conflict: Conflict) {
        conflictRepository.createConflict(conflict)
    }
}
