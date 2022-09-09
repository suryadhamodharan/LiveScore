package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName("matchType")
    val matchType:List<String>,
)
