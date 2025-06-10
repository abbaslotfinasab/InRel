package com.example.data.utile

import io.ktor.client.call.*
import io.ktor.client.statement.*
import kotlinx.serialization.SerializationException
import java.io.IOException
import javax.inject.Inject
import com.example.domain.utile.Result
import javax.inject.Singleton


@Singleton
class RemoteHelper @Inject constructor() {

    suspend inline fun <reified T> safeApiCall(call: suspend () -> HttpResponse): Result<T> {
        return try {
            val response = call()
            if (response.status.value in 200..299) {
                val body: T = response.body()
                Result.Success(body)
            } else {
                Result.Error("HTTP ${response.status.value}: ${response.status.description}")
            }
        } catch (e: IOException) {
            Result.Error("Network error: ${e.localizedMessage}")
        } catch (e: SerializationException) {
            Result.Error("Serialization error: ${e.localizedMessage}")
        } catch (e: Exception) {
            Result.Error("Unexpected error: ${e.localizedMessage}")
        }
    }
}
