package com.example.domain.usecase.gift

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Gift
import com.example.domain.repository.GiftRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class UpdateGiftUseCase @Inject constructor(
    private val giftRepository: GiftRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<Gift, Unit>(dispatcherProvider.io) {


    override suspend fun execute(params: Gift) {
        giftRepository.updateGift(params)
    }
}
