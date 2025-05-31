package com.example.domain.model

import java.time.LocalDateTime

data class Question(
    val id: String,                        // آیدی منحصربه‌فرد
    val text: String,                      // متن سوال
    val category: QuestionCategory,        // دسته‌بندی (عاشقانه، فان، جدی و ...)
    val createdByUserId: String? = null,   // اگه کاربر خودش ساخته
    val isCustom: Boolean = false,         // سوال ساخته شده توسط کاربر
    val createdAt: LocalDateTime? = null
)
