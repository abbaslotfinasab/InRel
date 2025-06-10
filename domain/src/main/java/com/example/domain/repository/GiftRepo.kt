package com.example.domain.repository


import com.example.domain.model.Gift
import kotlinx.coroutines.flow.Flow

interface GiftRepo{
    suspend fun addGift(gift: Gift)
    suspend fun updateGift(gift: Gift)
    suspend fun deleteGift(id: String)
    fun getGiftById(id: String): Gift?
    fun getGiftRelationId(relationId: String): List<Gift>
}
