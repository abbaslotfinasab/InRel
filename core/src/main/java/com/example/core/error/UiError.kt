package com.example.core.error

sealed class UiError {
    data class Message(val message: String) : UiError()
    data class Exception(val throwable: Throwable) : UiError()
    data object Network : UiError()
    data object Unauthorized : UiError()
    data object Unknown : UiError()
}