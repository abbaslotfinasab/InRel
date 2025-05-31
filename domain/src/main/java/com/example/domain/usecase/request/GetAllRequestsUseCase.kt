package com.example.domain.usecase.request

import com.example.domain.repository.RequestRepo
import javax.inject.Inject

class GetAllRequestsUseCase @Inject constructor(
    private val repository: RequestRepo
) {
    operator fun invoke() = repository.getAllRequests()
}
