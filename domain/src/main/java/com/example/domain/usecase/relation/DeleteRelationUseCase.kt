package com.example.domain.usecase.relation

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.repository.RelationRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class DeleteRelationUseCase @Inject constructor(
    private val repository: RelationRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: String) {
        repository.deleteRelation(params)
    }
}
