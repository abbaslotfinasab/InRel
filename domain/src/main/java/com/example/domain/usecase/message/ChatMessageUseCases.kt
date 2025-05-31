package com.example.domain.usecase.message

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChatMessageUseCases @Inject constructor(
    val sendMessage: SendMessageUseCase,
    val getMessagesForUser: GetMessagesForUser,
    val getMessagesForRelation: GetMessagesForRelation,
    val getLastMessageById: GetMessagesUseCase,
    val deleteMessage: DeleteMessageUseCase,
    val markMessageAsReadUseCase: MarkMessageAsReadUseCase
)
