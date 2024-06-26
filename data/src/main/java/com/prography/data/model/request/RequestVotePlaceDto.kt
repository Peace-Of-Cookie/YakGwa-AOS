package com.prography.data.model.request


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class RequestVotePlaceDto(
    @SerializedName("candidatePlaceIds")
    val candidatePlaceIds: List<Int>
)