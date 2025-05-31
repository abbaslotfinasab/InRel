package com.example.domain.usecase.media

import com.example.domain.repository.MediaRepo
import javax.inject.Inject

class DeleteMediaUseCase @Inject constructor (
    private val repository: MediaRepo
) {
    suspend operator fun invoke(mediaId: String) {
        repository.deleteMedia(mediaId)
    }
}