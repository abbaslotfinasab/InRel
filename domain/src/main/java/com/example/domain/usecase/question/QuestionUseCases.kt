package com.example.domain.usecase.question


import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuestionUseCases @Inject constructor(
    val getAllQuestions: GetAllQuestionsUseCase,
    val getQuestionById: GetQuestionByIdUseCase,
    val addQuestion: CreateQuestionUseCase,
    val updateQuestion: UpdateQuestionUseCase,
    val deleteQuestion: DeleteQuestionUseCase,
)