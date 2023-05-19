package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Response(
    @SerialName("current_page")
    val currentPage: Int,
    @SerialName("data")
    val data: List<Project>,
    @SerialName("first_page_url")
    val firstPageUrl: String,
    @SerialName("from")
    val from: Int,
    @SerialName("last_page")
    val lastPage: Int,
    @SerialName("last_page_url")
    val lastPageUrl: String,
    @SerialName("next_page_url")
    val nextPageUrl: String,
    @SerialName("per_page")
    val perPage: Int,
    @SerialName("prev_page_url")
    val prevPageUrl: String?,
    @SerialName("to")
    val to: Int
)