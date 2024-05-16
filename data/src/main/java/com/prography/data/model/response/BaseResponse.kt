package com.prography.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    @SerialName("code")
    val code: String ,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: T
)