package com.example.presentation.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.error.UiError
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

abstract class BaseViewModel<UI_STATE, UI_EVENT> : ViewModel() {

    private val initialState: UI_STATE by lazy { createInitialState() }
    private val _uiState = MutableStateFlow(initialState)
    val uiState: StateFlow<UI_STATE> = _uiState.asStateFlow()

    private val _uiError = MutableSharedFlow<UiError>()
    val uiError: SharedFlow<UiError> = _uiError.asSharedFlow()

    private val _eventFlow = MutableSharedFlow<UI_EVENT>()
    val eventFlow: SharedFlow<UI_EVENT> = _eventFlow.asSharedFlow()

    protected val viewModelScopeEx = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    abstract fun createInitialState(): UI_STATE
    abstract fun onEvent(event: UI_EVENT)

    protected fun setState(reducer: UI_STATE.() -> UI_STATE) {
        _uiState.value = _uiState.value.reducer()
    }

    protected fun emitEvent(event: UI_EVENT) {
        viewModelScope.launch {
            _eventFlow.emit(event)
        }
    }

    protected fun emitError(error: UiError) {
        viewModelScope.launch {
            _uiError.emit(error)
        }
    }
}
