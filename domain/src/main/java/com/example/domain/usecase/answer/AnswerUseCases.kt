package com.example.domain.usecase.answer

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnswerUseCases @Inject constructor(
    val submitAnswer: SubmitAnswerUseCase,
    val getAnswersByRelationUseCase: GetAnswersByRelationUseCase,
    val getAnswersByIdUseCase: GetAnswersByIdUseCase,
    val getAnswersByUser: GetAnswersByUserUseCase,
    val getAnswersByQuestion: GetAnswersByQuestionUseCase,
    val deleteAnswer: DeleteAnswerUseCase,
    val updateAnswerUseCase: UpdateAnswerUseCase

)
