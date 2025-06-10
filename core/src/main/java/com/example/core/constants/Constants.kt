package com.example.core.constants

import com.example.core.BuildConfig


object Constants {

    // ✅ API
    const val BASE_URL: String = BuildConfig.BASE_URL
    val ENABLE_LOGGING: Boolean = BuildConfig.ENABLE_LOGGING
    const val READ_TIMEOUT = 30L
    const val WRITE_TIMEOUT = 30L

    // ✅ DATABASE
    const val DATABASE_NAME = "yourapp_database"

    // ✅ SharedPreferences
    const val PREF_NAME = "yourapp_preferences"
    const val PREF_KEY_TOKEN = "pref_key_token"
    const val PREF_KEY_IS_LOGGED_IN = "pref_key_is_logged_in"
    const val PREF_KEY_ONBOARDING_SHOWN = "pref_key_onboarding_shown"
    const val PREF_KEY_USER_ID = "pref_key_user_id"

    // ✅ Navigation Routes
    const val ROUTE_SPLASH = "splash"
    const val ROUTE_ONBOARDING = "onboarding"
    const val ROUTE_LOGIN = "login"
    const val ROUTE_REGISTER = "register"
    const val ROUTE_HOME = "home"
    const val ROUTE_PROFILE = "profile"
    const val ROUTE_SETTINGS = "settings"
    const val ROUTE_NOTIFICATIONS = "notifications"
    const val ROUTE_CHAT = "chat"
    const val ROUTE_GIFTS = "gifts"
    const val ROUTE_RELATION = "relation"

    // ✅ Notifications
    const val NOTIFICATION_CHANNEL_ID = "yourapp_channel_id"
    const val NOTIFICATION_CHANNEL_NAME = "YourApp Notifications"
    const val NOTIFICATION_ID_DEFAULT = 1000

    // ✅ Date & Time
    const val DATE_FORMAT_STANDARD = "yyyy-MM-dd"
    const val DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"
    const val TIME_FORMAT = "HH:mm"

    // ✅ Permissions
    const val REQUEST_CODE_STORAGE = 101
    const val REQUEST_CODE_CAMERA = 102
    const val REQUEST_CODE_NOTIFICATION = 103

    // ✅ Error Messages
    const val ERROR_UNKNOWN = "An unknown error occurred."
    const val ERROR_NO_INTERNET = "No internet connection."
    const val ERROR_TIMEOUT = "Connection timed out."
    const val ERROR_API = "Something went wrong. Please try again."

    // ✅ Firebase (اگر در آینده استفاده کردی)
    const val FIREBASE_USER_COLLECTION = "users"
    const val FIREBASE_CHAT_COLLECTION = "chats"
    const val FIREBASE_MESSAGES = "messages"

    // ✅ UI Constants
    const val ANIMATION_DURATION = 300
    const val MAX_USERNAME_LENGTH = 20
    const val MIN_PASSWORD_LENGTH = 6

    // ✅ Media Upload
    const val MAX_IMAGE_SIZE_MB = 5
    const val SUPPORTED_IMAGE_FORMATS = "jpg, jpeg, png"

    // ✅ Misc
    const val EMPTY_STRING = ""
    const val DEFAULT_USER_ID = "anonymous"
}
