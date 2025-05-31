package com.example.domain.usecase.media


import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import javax.inject.Inject

class UpdateMediaUseCase @Inject constructor(
    private val repository: MediaRepo
) {
    suspend operator fun invoke(media: Media) {
        return repository.updateMedia(media)
    }
}