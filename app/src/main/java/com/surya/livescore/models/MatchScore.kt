package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class MatchScore(
    @SerializedName("team1Score")
    val team1Score: Team1Score?,
    @SerializedName("team2Score")
    val team2Score: Team2Score?
)