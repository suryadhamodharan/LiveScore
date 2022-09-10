package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class SeriesMatches(
    @SerializedName("matches")
    val matches: List<Match>?,
    @SerializedName("seriesId")
    val seriesId: Int?,
    @SerializedName("seriesName")
    val seriesName: String?
)