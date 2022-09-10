package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class TypeMatche(
    @SerializedName("matchType")
    val matchType: String?,
    @SerializedName("seriesAdWrapper")
    val seriesAdWrapper: List<SeriesAdWrapper>?
)