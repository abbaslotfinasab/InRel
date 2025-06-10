package com.example.core.utile


enum class DateFormatPattern(val pattern: String) {
    FULL_DATE("yyyy-MM-dd"),
    FULL_DATE_TIME("yyyy-MM-dd HH:mm:ss"),
    TIME_ONLY("HH:mm"),
    HUMAN_READABLE("dd MMM yyyy"),
    PERSIAN_DATE("yyyy/MM/dd"), // فقط اگر JodaTime یا PersianCalendar داری استفاده می‌کنی
    FULL_PERSIAN_DATE("yyyy/MM/dd HH:mm:ss") // فقط اگر JodaTime یا PersianCalendar داری استفاده می‌کنی

}
