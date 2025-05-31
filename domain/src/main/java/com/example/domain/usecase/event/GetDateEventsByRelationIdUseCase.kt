package com.example.domain.usecase.event

import com.example.domain.model.DateEvent
import com.example.domain.repository.DateEventRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDateEventsByRelationIdUseCase @Inject constructor(
    private val dateEventRepository: DateEventRepo
) {
    operator fun invoke(relationId: String): Flow<List<DateEvent>> {
        return dateEventRepository.getDateEventsByRelationId(relationId)
    }
}
