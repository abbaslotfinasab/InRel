package com.example.domain.usecase.health

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HealthUseCases @Inject constructor(
    val getHealthRecords: GetHealthRecordsUseCase,
    val addHealthRecord: CreateHealthRecordUseCase,
    val updateHealthRecord: UpdateHealthRecordUseCase,
    val deleteHealthRecord: DeleteHealthRecordUseCase,
    val getHealthEntryByIdUseCase: GetHealthEntryByIdUseCase
)
