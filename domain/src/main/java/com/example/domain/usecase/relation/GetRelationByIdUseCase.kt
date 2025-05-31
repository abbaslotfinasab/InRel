package com.example.domain.usecase.relation

import com.example.domain.repository.RelationRepo
import javax.inject.Inject

class GetRelationByIdUseCase @Inject constructor(
    private val repository: RelationRepo
) {
    operator fun invoke(id: String) = repository.getRelationById(id)
}
