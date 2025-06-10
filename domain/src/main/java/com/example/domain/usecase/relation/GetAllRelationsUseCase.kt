package com.example.domain.usecase.relation

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Relation
import com.example.domain.repository.RelationRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetAllRelationsUseCase @Inject constructor(
    private val repository: RelationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<Relation>>(dispatcherProvider.io) {


    override suspend fun execute(params: Unit): List<Relation> {
        return repository.getAllRelations()
    }
}
