package com.example.domain.model

data class Conflict(
    val id: String,
    val senderId: String,
    val relationId: String,
    val startTime: Long,  // timestamp
    val endTime: Long?,   // nullable چون ممکنه هنوز تموم نشده باشه
    val category: ConflictCategory,
    val severity: SeverityLevel,
    val description: String,
    val triggers: List<String>, // مثل "حسادت"، "پول"، "بی‌توجهی"
    val resolutionStatus: ResolutionStatus,
    val resolvedAt: Long?, // اگه حل شده باشه
    val resolutionNotes: String? // نکاتی که در حلش مفید بودن
)
