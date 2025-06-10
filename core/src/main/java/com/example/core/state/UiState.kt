package com.example.core.state

import com.example.core.error.UiError

data class UiState<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val error: UiError? = null,
    val isEmpty: Boolean = false
)