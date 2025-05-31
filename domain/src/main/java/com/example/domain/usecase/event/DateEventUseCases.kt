package com.example.domain.usecase.event

import javax.inject.Inject

class DateEventUseCases @Inject constructor(
    val createDateEvent: CreateDateEventUseCase,
    val getDateEventsByRelationIdUseCase: GetDateEventsByRelationIdUseCase,
    val getDateEventsByIdUseCase: GetDateEventsByIdUseCase,
    val getDateEventsByUserIdUseCase: GetDateEventsByUserIdUseCase,
    val updateDateEvent: UpdateDateEventUseCase,
    val deleteDateEvent: DeleteDateEventUseCase,
)
