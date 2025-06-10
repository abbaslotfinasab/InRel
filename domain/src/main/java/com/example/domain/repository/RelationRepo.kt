package com.example.domain.repository

import com.example.domain.model.Relation
import kotlinx.coroutines.flow.Flow

interface RelationRepo {
    suspend fun createRelation(relation: Relation)
    suspend fun updateRelation(relation: Relation)
    suspend fun deleteRelation(id: String)
    fun getRelationById(id: String): Relation?
    fun getRelationsByUser(userId: String): Relation?
    fun getAllRelations(): List<Relation>
}
