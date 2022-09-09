package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class VenueInfo(
    @SerializedName("ground")
    val ground:String,
    @SerializedName("city")
    val city:String,
    @SerializedName("timezone")
    val timeZone:String,

)
