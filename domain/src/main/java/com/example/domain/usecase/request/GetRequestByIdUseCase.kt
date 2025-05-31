package com.example.domain.usecase.request

import com.example.domain.repository.RequestRepo
import javax.inject.Inject

class GetRequestByIdUseCase @Inject constructor(
    private val repository: RequestRepo
) {
    operator fun invoke(id: String) = repository.getRequestById(id)
}
