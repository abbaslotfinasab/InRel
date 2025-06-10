package com.example.domain.usecase.request

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Request
import com.example.domain.repository.RequestRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetAllRequestsUseCase @Inject constructor(
    private val repository: RequestRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Unit, List<Request>>(dispatcherProvider.io) {

    override suspend fun execute(params: Unit): List<Request> {
        return  repository.getAllRequests()
    }
}
