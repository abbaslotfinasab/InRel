package com.example.data.dto

import com.example.domain.model.Gender
import com.example.domain.model.RelationshipStatus
import java.time.LocalDate
import java.time.LocalDateTime

data class UserDto(
    val id: String,                          // Unique ID (could be Firebase UID or UUID)
    val name: String,
    val family: String,
    val email: String? = null,
    val phoneNumber: String? = null,
    val profileImageUrl: String? = null,
    val gender: Gender = Gender.UNSPECIFIED,
    val birthDate: LocalDate? = null,
    val partnerId: String? = null,           // ID of the partner user (if any)
    val relationshipStatus: RelationshipStatus = RelationshipStatus.SINGLE,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null

)

