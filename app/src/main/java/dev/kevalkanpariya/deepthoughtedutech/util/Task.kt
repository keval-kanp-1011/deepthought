package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Task(
    @SerialName("assets")
    val assets: List<Asset>,
    @SerialName("status")
    val status: String,
    @SerialName("task_description")
    val taskDescription: String,
    @SerialName("task_id")
    val taskId: Int,
    @SerialName("task_title")
    val taskTitle: String
)