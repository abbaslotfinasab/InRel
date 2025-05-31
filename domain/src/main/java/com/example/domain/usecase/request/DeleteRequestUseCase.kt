package com.example.domain.usecase.request

import com.example.domain.repository.RequestRepo
import javax.inject.Inject

class DeleteRequestUseCase @Inject constructor(
    private val repository: RequestRepo
) {
    suspend operator fun invoke(id: String) {
        repository.deleteRequest(id)
    }
}
