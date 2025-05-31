package com.example.domain.usecase.gift

import com.example.domain.repository.GiftRepo
import javax.inject.Inject

class DeleteGiftUseCase @Inject constructor(
    private val giftRepository: GiftRepo
) {
    suspend operator fun invoke(id: String) {
        giftRepository.deleteGift(id)
    }
}
