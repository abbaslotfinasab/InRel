package com.example.domain.usecase.relation

import com.example.domain.repository.RelationRepo
import javax.inject.Inject

class GetRelationsByUserIdUseCase @Inject constructor(
    private val repository: RelationRepo
) {
    operator fun invoke(userId: String) = repository.getRelationsByUser(userId)
}
