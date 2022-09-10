package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Match(
    @SerializedName("matchInfo")
    val matchInfo: MatchInfo?,
    @SerializedName("matchScore")
    val matchScore: MatchScore?
)