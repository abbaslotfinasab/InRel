package com.example.domain.usecase.media

import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMediaByIdUseCase @Inject constructor(
    private val repository: MediaRepo
) {
    suspend operator fun invoke(mediaId: String): Flow<Media?> {
        return repository.getMediaById(mediaId)
    }
}