package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("teamName")
    val teamName:String,
    @SerializedName("teamSName")
    val teamSName:String,
    @SerializedName("imageId")
    val imageId:Int
)
