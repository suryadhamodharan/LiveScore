package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Cricket(
    @SerializedName("typeMatches")
val typematches: List<Typematch>
)
