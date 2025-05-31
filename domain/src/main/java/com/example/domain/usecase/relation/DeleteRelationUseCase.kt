package com.example.domain.usecase.relation

import com.example.domain.repository.RelationRepo
import javax.inject.Inject

class DeleteRelationUseCase @Inject constructor(
    private val repository: RelationRepo
) {
    suspend operator fun invoke(id: String) {
        repository.deleteRelation(id)
    }
}
