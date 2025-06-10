package com.example.core.extensions

import android.util.Patterns
import java.util.Locale

fun String.capitalizeFirst(): String =
    this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

fun String.isEmail(): Boolean =
    Patterns.EMAIL_ADDRESS.matcher(this).matches()
