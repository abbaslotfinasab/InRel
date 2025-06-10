package com.example.domain.usecase.media

import com.example.domain.usecase.memory.GetMemoryByIdUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MediaUseCases @Inject constructor(
    val deleteMediaUseCase: DeleteMediaUseCase,
    val getMediaByIdUseCase: GetMediaByIdUseCase,
    val getMediaByRelationUseCase: GetMediaByRelationUseCase,
    val getMemoryByIdUseCase: GetMemoryByIdUseCase,
    val getMediaByUserIdUseCase: GetMediaByUserIdUseCase,
    val updateMediaUseCase: UpdateMediaUseCase,
    val uploadMediaUseCase: UploadMediaUseCase

)