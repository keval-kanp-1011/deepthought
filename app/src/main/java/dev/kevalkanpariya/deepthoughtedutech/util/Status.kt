package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    @SerialName("code")
    val code: String,
    @SerialName("message")
    val message: String
)