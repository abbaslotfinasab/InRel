package com.example.domain.utile


fun <T> Result<T>.getOrThrow(): T {
    return when (this) {
        is Result.Success -> data
        is Result.Error -> throw throwable ?: Exception(message ?: "Unknown error")
        else -> throw IllegalStateException("Unexpected state: $this")
    }
}
