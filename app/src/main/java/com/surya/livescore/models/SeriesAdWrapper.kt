package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class SeriesAdWrapper(
    @SerializedName("seriesMatches")
    val seriesMatches: List<SeriesMatch>
)
