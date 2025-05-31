package com.example.domain.usecase.relation


import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RelationUseCases @Inject constructor(
    val createRelation: CreateRelationUseCase,
    val updateRelation: UpdateRelationUseCase,
    val deleteRelation: DeleteRelationUseCase,
    val getRelationById: GetRelationByIdUseCase,
    val getRelationsByUserId: GetRelationsByUserIdUseCase,
    val getAllRelations: GetAllRelationsUseCase
)
