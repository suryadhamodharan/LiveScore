package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Inngs1(
    @SerializedName("inningsId")
    val inningsId: Int?,
    @SerializedName("isDeclared")
    val isDeclared: Boolean?,
    @SerializedName("overs")
    val overs: Double?,
    @SerializedName("runs")
    val runs: Int?,
    @SerializedName("wickets")
    val wickets: Int?

)