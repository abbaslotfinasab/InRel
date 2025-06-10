package com.example.domain.repository

import com.example.domain.model.Media
import kotlinx.coroutines.flow.Flow

interface MediaRepo {
    suspend fun uploadMedia(media: Media)

    suspend fun getMediaByRelation(relationId: String): List<Media>

    suspend fun getMediaByUserId(userId: String): List<Media>

    suspend fun getMediaById(id: String): Media?

    suspend fun deleteMedia(id: String)

    suspend fun updateMedia(media: Media)
}