package com.example.domain.usecase.media


import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import javax.inject.Inject

class UploadMediaUseCase @Inject constructor(
    private val repository: MediaRepo
) {
    suspend operator fun invoke(media: Media) {
        return repository.uploadMedia(media)
    }
}