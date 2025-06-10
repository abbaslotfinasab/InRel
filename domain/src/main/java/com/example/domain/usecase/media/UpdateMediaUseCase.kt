package com.example.domain.usecase.media


import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class UpdateMediaUseCase @Inject constructor(
    private val repository: MediaRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Media, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Media) {
        return repository.updateMedia(params)
    }
}