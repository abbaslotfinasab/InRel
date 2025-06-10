package com.example.data.mapper

import com.example.data.dto.AnswerDto
import com.example.domain.model.Answer

fun AnswerDto.toDomain(): Answer {
    return Answer(
        id = id,
        userId = userId,
        questionId = questionId,
        text = text,
        createdAt = createdAt
    )
}

fun Answer.toDto(): AnswerDto {
    return AnswerDto(
        id = id,
        userId = userId,
        questionId = questionId,
        text = text,
        createdAt = createdAt
    )
}