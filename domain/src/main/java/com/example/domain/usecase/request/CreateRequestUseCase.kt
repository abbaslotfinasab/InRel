package com.example.domain.usecase.request


import com.example.domain.model.Request
import com.example.domain.repository.RequestRepo
import javax.inject.Inject

class CreateRequestUseCase @Inject constructor(
    private val repository: RequestRepo
) {
    suspend operator fun invoke(request: Request) {
        repository.createRequest(request)
    }
}
