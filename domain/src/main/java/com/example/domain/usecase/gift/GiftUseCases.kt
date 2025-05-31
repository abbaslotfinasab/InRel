package com.example.domain.usecase.gift

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GiftUseCases @Inject constructor(
    val addGift: CreateGiftUseCase,
    val getGiftsByRelationId: GetGiftsByRelationIdUseCase,
    val getGiftsById: GetGiftsByIdUseCase,
    val updateGift: UpdateGiftUseCase,
    val deleteGift: DeleteGiftUseCase,
)
