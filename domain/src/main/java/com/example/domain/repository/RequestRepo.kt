package com.example.domain.repository

import com.example.domain.model.Request
import kotlinx.coroutines.flow.Flow

interface RequestRepo {

    suspend fun createRequest(request: Request)

    suspend fun updateRequest(request: Request)

    suspend fun deleteRequest(id: String)

    fun getRequestById(id: String): Request?

    fun getRequestsByUser(userId: String): List<Request>

    fun getAllRequests(): List<Request>
}
