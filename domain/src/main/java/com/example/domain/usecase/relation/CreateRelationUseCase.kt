package com.example.domain.usecase.relation

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Question
import com.example.domain.model.Relation
import com.example.domain.repository.RelationRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateRelationUseCase @Inject constructor(
    private val repository: RelationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Relation, Unit>(dispatcherProvider.io) {

    override suspend fun execute(params: Relation) {
        repository.createRelation(params)
    }
}
