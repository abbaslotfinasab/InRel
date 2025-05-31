package com.example.domain.usecase.relation

import com.example.domain.repository.RelationRepo
import javax.inject.Inject

class GetAllRelationsUseCase @Inject constructor(
    private val repository: RelationRepo
) {
    operator fun invoke() = repository.getAllRelations()
}
