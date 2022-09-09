package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Typematch(
    @SerializedName("matchType")
    val matchType: String,
    @SerializedName("seriesAdWrapper")
    val seriesAdWrappers: List<SeriesAdWrapper>,
)
