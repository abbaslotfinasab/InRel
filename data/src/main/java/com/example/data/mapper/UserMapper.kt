package com.example.data.mapper

import com.example.data.dto.UserDto
import com.example.domain.model.User

fun UserDto.toDomain(): User {
    return User(
        id = id,
        name = name,
        family = family,
        email = email
    )
}


fun User.toDto(): UserDto {
    return UserDto(
        id = id,
        name = name,
        family = family,
        email = email
    )
}