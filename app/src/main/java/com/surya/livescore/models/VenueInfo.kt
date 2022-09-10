package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class VenueInfo(
    @SerializedName("city")
    val city: String?,
    @SerializedName("ground")
    val ground: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("timezone")
    val timezone: String?
)