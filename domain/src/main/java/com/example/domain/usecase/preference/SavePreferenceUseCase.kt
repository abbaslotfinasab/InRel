package com.example.domain.usecase.preference

import com.example.domain.repository.PreferenceRepo
import javax.inject.Inject

class SavePreferenceUseCase @Inject constructor(
    private val repository: PreferenceRepo
) {
    suspend operator fun invoke(key: String, value: String) {
        repository.clearPreferences()
    }
}