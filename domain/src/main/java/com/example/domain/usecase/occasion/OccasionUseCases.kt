package com.example.domain.usecase.occasion

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class OccasionUseCases @Inject constructor(
    val getAllOccasions: GetAllOccasionsUseCase,
    val getOccasionById: GetOccasionByIdUseCase,
    val addOccasion: CreateOccasionUseCase,
    val updateOccasion: UpdateOccasionUseCase,
    val deleteOccasion: DeleteOccasionUseCase,
)