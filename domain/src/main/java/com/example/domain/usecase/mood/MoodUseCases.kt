package com.example.domain.usecase.mood

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MoodUseCases @Inject constructor(
    val getAllMoods: GetAllMoodsUseCase,
    val getMoodById: GetMoodByIdUseCase,
    val addMood: CreateMoodUseCase,
    val updateMood: UpdateMoodUseCase,
    val deleteMood: DeleteMoodUseCase,
)