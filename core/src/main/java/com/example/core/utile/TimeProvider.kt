package com.example.core.utile

import java.util.concurrent.TimeUnit

interface TimeProvider {
    fun currentTimestamp(): Long
    fun timeDifference(startMillis: Long, endMillis: Long, unit: TimeUnit = TimeUnit.MILLISECONDS): Long
    fun getRelativeTime(millis: Long): String
}
