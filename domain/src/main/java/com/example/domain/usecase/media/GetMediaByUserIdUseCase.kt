package com.example.domain.usecase.media

import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMediaByUserIdUseCase @Inject constructor(
    private val repository: MediaRepo
) {
    suspend operator fun invoke(userId: String): Flow<List<Media>> {
        return repository.getMediaByUserId(userId)
    }
}