package com.example.domain.usecase.request


import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Relation
import com.example.domain.model.Request
import com.example.domain.repository.RequestRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class CreateRequestUseCase @Inject constructor(
    private val repository: RequestRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Request, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Request) {
        repository.createRequest(params)
    }
}
