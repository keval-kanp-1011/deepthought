package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Asset(
    @SerialName("asset_content")
    val assetContent: String,
    @SerialName("asset_content_type")
    val assetContentType: String,
    @SerialName("asset_description")
    val assetDescription: String,
    @SerialName("asset_id")
    val assetId: Int,
    @SerialName("asset_title")
    val assetTitle: String,
    @SerialName("asset_type")
    val assetType: String
)