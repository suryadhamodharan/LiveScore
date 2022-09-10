package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Cricket(
    @SerializedName("appIndex")
    val appIndex: AppIndex?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("responseLastUpdated")
    val responseLastUpdated: String?,
    @SerializedName("typeMatches")
    val typeMatches: List<TypeMatche>?
)