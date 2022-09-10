package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class AdDetail(
    @SerializedName("adLayout")
    val adLayout: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("position")
    val position: Int?
)