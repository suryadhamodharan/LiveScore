package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class SeriesAdWrapper(
    @SerializedName("adDetail")
    val adDetail: AdDetail?,
    @SerializedName("seriesMatches")
    val seriesMatches: SeriesMatches?
)