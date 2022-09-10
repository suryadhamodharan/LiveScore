package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class AppIndex(
    @SerializedName("seoTitle")
    val seoTitle: String?,
    @SerializedName("webURL")
    val webURL: String?
)