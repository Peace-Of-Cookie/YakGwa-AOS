package com.prography.data.model.request


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class RequestCreateMeetDto(
    @SerializedName("meetName")
    val meetName: String,
    @SerializedName("meetDescription")
    val meetDescription: String,
    @SerializedName("meetThemeId")
    val meetThemeId: Int,
    @SerializedName("places")
    val places: List<String>,
    @SerializedName("voteDateRange")
    val voteDateRange: VoteDateRange,
    @SerializedName("voteTimeRange")
    val voteTimeRange: VoteTimeRange,
    @SerializedName("endVoteHour")
    val entVoteHour: Int
) {
    @Serializable
    data class VoteDateRange(
        @SerializedName("start")
        val start: String,
        @SerializedName("end")
        val end: String
    )

    @Serializable
    data class VoteTimeRange(
        @SerializedName("start")
        val start: String,
        @SerializedName("end")
        val end: String
    )
}