package com.example.domain.model

data class Request(
    val id: String,
    val senderId: String,         // آیدی کاربری که درخواست داده
    val receiverId: String,       // آیدی کسی که قراره پاسخ بده
    val title: String,            // عنوان درخواست (مثلاً: "بیا فیلم ببینیم")
    val message: String,          // پیام دلخواه یا توضیح بیشتر
    val type: RequestType,        // نوع درخواست (مثلاً هدیه، تایم‌با‌هم‌بودن و...)
    val status: RequestStatus,    // وضعیت (در حال بررسی، تایید شده، رد شده)
    val timestamp: Long           // زمان ساخت درخواست
)
