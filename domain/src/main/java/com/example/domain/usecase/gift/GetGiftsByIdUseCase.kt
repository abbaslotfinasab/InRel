package com.example.domain.usecase.gift

import com.example.domain.model.Gift
import com.example.domain.repository.GiftRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGiftsByIdUseCase @Inject constructor(
    private val giftRepository: GiftRepo
) {
    operator fun invoke(id: String): Flow<Gift?> {
        return giftRepository.getGiftById(id)
    }
}
