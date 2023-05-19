package dev.kevalkanpariya.deepthoughtedutech.util


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Project(
    @SerialName("category")
    val category: String,
    @SerialName("cid")
    val cid: String?,
    @SerialName("commitment")
    val commitment: String,
    @SerialName("commitment_type")
    val commitmentType: String?,
    @SerialName("deadline")
    val deadline: String,
    @SerialName("description")
    val description: String,
    @SerialName("evaluatedCount")
    val evaluatedCount: Int,
    @SerialName("faqs")
    val faqs: List<String>,
    @SerialName("globalTags")
    val globalTags: List<String>,
    @SerialName("_id")
    val id: String,
    @SerialName("isActive")
    val isActive: Boolean,
    @SerialName("_key")
    val key: String,
    @SerialName("lastposttime")
    val lastposttime: Int,
    @SerialName("learning_outcomes")
    val learningOutcomes: List<String>,
    @SerialName("macrodata")
    val macrodata: Macrodata,
    @SerialName("mainPid")
    val mainPid: Int,
    @SerialName("native_tid")
    val nativeTid: Int?,
    @SerialName("native_uid")
    val nativeUid: Int?,
    @SerialName("postcount")
    val postcount: Int,
    @SerialName("pre_requisites")
    val preRequisites: List<String>,
    @SerialName("project_image")
    val projectImage: String,
    @SerialName("publishedAt")
    val publishedAt: Long,
    @SerialName("recruiter")
    val recruiter: Recruiter,
    @SerialName("scorecardAssociationTime")
    val scorecardAssociationTime: Long?,
    @SerialName("scorecardId")
    val scorecardId: Int?,
    @SerialName("scorecardTitle")
    val scorecardTitle: String?,
    @SerialName("short_description")
    val shortDescription: String,
    @SerialName("slug")
    val slug: String,
    @SerialName("status")
    val status: String,
    @SerialName("tasks")
    val tasks: List<Task>,
    @SerialName("tid")
    val tid: Int,
    @SerialName("timestamp")
    val timestamp: Long,
    @SerialName("title")
    val title: String,
    @SerialName("type")
    val type: String,
    @SerialName("uid")
    val uid: Int,
    @SerialName("viewcount")
    val viewcount: Int
)
