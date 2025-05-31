package com.example.domain.usecase.gift

import com.example.domain.model.Gift
import com.example.domain.repository.GiftRepo
import javax.inject.Inject

class UpdateGiftUseCase @Inject constructor(
    private val giftRepository: GiftRepo
) {
    suspend operator fun invoke(gift: Gift) {
        giftRepository.updateGift(gift)
    }
}
