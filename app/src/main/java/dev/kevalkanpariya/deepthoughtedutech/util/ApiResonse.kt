package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    @SerialName("response")
    val response: Response,
    @SerialName("status")
    val status: Status
)