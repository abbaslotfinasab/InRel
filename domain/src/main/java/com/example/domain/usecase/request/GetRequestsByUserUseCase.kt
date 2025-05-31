package com.example.domain.usecase.request

import com.example.domain.repository.RequestRepo
import javax.inject.Inject

class GetRequestsByUserUseCase @Inject constructor(
    private val repository: RequestRepo
) {
    operator fun invoke(userId: String) = repository.getRequestsByUser(userId)
}
