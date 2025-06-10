package com.example.core.utile


import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateFormatter @Inject constructor(
    private val defaultLocale: Locale = Locale.getDefault(),
    private val defaultTimeZone: TimeZone = TimeZone.getDefault()
) {

    fun format(
        date: Date,
        pattern: DateFormatPattern,
        locale: Locale = defaultLocale,
        timeZone: TimeZone = defaultTimeZone
    ): String {
        val formatter = SimpleDateFormat(pattern.pattern, locale)
        formatter.timeZone = timeZone
        return formatter.format(date)
    }

    fun parse(
        dateStr: String,
        pattern: DateFormatPattern,
        locale: Locale = defaultLocale,
        timeZone: TimeZone = defaultTimeZone
    ): Date? {
        return try {
            val formatter = SimpleDateFormat(pattern.pattern, locale)
            formatter.timeZone = timeZone
            formatter.parse(dateStr)
        } catch (e: Exception) {
            null
        }
    }

    fun nowFormatted(pattern: DateFormatPattern): String {
        return format(Date(), pattern)
    }
}
