package com.example.domain.usecase.media

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Media
import com.example.domain.repository.MediaRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetMediaByIdUseCase @Inject constructor(
    private val repository: MediaRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Media?>(dispatcherProvider.io) {


    override suspend fun execute(params: String): Media? {
        return repository.getMediaById(params)
    }
}