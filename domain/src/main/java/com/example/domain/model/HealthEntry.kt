package com.example.domain.model

import java.time.LocalDate

data class HealthEntry(
    val id: String,
    val userId: String,
    val type: HealthType,                    // نوع رکورد (مثلاً mood، period، sleep)
    val value: String,                       // مقدار (مثلاً "Happy", "Started period", "8 hours")
    val date: LocalDate? = null,   // تاریخی که ثبت شده
    val note: String? = null                 // توضیح اختیاری
)
