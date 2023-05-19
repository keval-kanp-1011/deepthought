package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recruiter(
    @SerialName("displayname")
    val displayname: String,
    @SerialName("fullname")
    val fullname: String?,
    @SerialName("icon:bgColor")
    val iconBgColor: String,
    @SerialName("icon:text")
    val iconText: String,
    @SerialName("picture")
    val picture: String,
    @SerialName("uid")
    val uid: Int,
    @SerialName("username")
    val username: String,
    @SerialName("userslug")
    val userslug: String
)