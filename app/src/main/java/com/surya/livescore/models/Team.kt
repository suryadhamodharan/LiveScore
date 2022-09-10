package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("imageId")
    val imageId: Int?,
    @SerializedName("teamId")
    val teamId: Int?,
    @SerializedName("teamName")
    val teamName: String?,
    @SerializedName("teamSName")
    val teamSName: String?
)