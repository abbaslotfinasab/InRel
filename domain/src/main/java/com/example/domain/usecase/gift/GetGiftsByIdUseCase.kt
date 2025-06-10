package com.example.domain.usecase.gift

import com.example.domain.dispatcher.DispatcherProvider
import com.example.domain.model.Gift
import com.example.domain.repository.GiftRepo
import com.example.domain.usecase.BaseFlowUseCase
import javax.inject.Inject

class GetGiftsByIdUseCase @Inject constructor(
    private val giftRepository: GiftRepo,
    dispatcherProvider: DispatcherProvider
) : BaseFlowUseCase<String, Gift?>(dispatcherProvider.io) {

    override suspend fun execute(params: String): Gift? {
        return giftRepository.getGiftById(params)
    }
}
