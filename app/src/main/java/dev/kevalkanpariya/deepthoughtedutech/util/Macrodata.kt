package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Macrodata(
    @SerialName("applicant_count")
    val applicantCount: Int,
    @SerialName("pending_count")
    val pendingCount: Int,
    @SerialName("reAsigned_count")
    val reAsignedCount: Int
)