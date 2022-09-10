package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Team2Score(
    @SerializedName("inngs1")
    val inngs1: Inngs1?,
    @SerializedName("inngs2")
    val inngs2: Inngs1?
)