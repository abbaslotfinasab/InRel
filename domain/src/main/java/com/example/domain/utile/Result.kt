package com.example.domain.utile

sealed class Result<out T> {

    data class Success<out T>(val data: T) : Result<T>()

    data class Error(
        val message: String? = null,
        val throwable: Throwable? = null
    ) : Result<Nothing>()

    data object Loading : Result<Nothing>()

    data object Idle : Result<Nothing>()

    // Map فقط روی Success اعمال میشه
    inline fun <R> map(transform: (T) -> R): Result<R> = when (this) {
        is Success -> Success(transform(data))
        is Error -> this
        Loading -> Loading
        Idle -> Idle
    }
}
