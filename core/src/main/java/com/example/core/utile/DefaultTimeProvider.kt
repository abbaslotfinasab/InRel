package com.example.core.utile

import java.util.Locale
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class DefaultTimeProvider @Inject constructor() : TimeProvider {

    override fun currentTimestamp(): Long = System.currentTimeMillis()

    override fun timeDifference(
        startMillis: Long,
        endMillis: Long,
        unit: TimeUnit
    ): Long {
        val diff = endMillis - startMillis
        return unit.convert(diff, TimeUnit.MILLISECONDS)
    }

    override fun getRelativeTime(millis: Long): String {
        val now = System.currentTimeMillis()
        val diff = now - millis

        val seconds = TimeUnit.MILLISECONDS.toSeconds(diff)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(diff)
        val hours = TimeUnit.MILLISECONDS.toHours(diff)
        val days = TimeUnit.MILLISECONDS.toDays(diff)

        return when {
            seconds < 60 -> "Just now"
            minutes < 60 -> "$minutes minute${if (minutes > 1) "s" else ""} ago"
            hours < 24 -> "$hours hour${if (hours > 1) "s" else ""} ago"
            days < 7 -> "$days day${if (days > 1) "s" else ""} ago"
            else -> "on ${java.text.SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(java.util.Date(millis))}"
        }
    }
}
