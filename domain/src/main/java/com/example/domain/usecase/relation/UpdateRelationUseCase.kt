package com.example.domain.usecase.relation

import com.example.domain.model.Relation
import com.example.domain.repository.RelationRepo
import javax.inject.Inject

class UpdateRelationUseCase @Inject constructor(
    private val repository: RelationRepo
) {
    suspend operator fun invoke(relation: Relation) {
        repository.updateRelation(relation)
    }
}
