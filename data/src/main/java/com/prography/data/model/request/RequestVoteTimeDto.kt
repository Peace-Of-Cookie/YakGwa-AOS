package com.prography.data.model.request


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class RequestVoteTimeDto(
    @SerializedName("possibleSchedules")
    val possibleSchedules: List<PossibleSchedule>
) {
    @Serializable
    data class PossibleSchedule(
        @SerializedName("possibleStartTime")
        val possibleStartTime: String,
        @SerializedName("possibleEndTime")
        val possibleEndTime: String
    )
}