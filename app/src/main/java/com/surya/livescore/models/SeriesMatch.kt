package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class SeriesMatch(
    @SerializedName("seriesName")
    val seriesName: String,
    @SerializedName("matches")
    val matches: List<Match>,
)
