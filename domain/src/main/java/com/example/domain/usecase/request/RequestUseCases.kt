package com.example.domain.usecase.request

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RequestUseCases @Inject constructor(
    val createRequest: CreateRequestUseCase,
    val updateRequest: UpdateRequestUseCase,
    val deleteRequest: DeleteRequestUseCase,
    val getRequestById: GetRequestByIdUseCase,
    val getRequestsByUser: GetRequestsByUserUseCase,
    val getAllRequests: GetAllRequestsUseCase
)
