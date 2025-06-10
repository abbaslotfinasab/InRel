package com.example.domain.usecase


import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

import com.example.domain.utile.Result

abstract class BaseFlowUseCase<in Params, T>(
    private val dispatcher: CoroutineDispatcher
) {
    operator fun invoke(params: Params): Flow<Result<T>> = flow {
        emit(Result.Loading)
        try {
            val data = execute(params)
            emit(Result.Success(data))
        } catch (e: Exception) {
            emit(Result.Error(e.message))
        }
    }.flowOn(dispatcher)

    protected abstract suspend fun execute(params: Params): T
}
