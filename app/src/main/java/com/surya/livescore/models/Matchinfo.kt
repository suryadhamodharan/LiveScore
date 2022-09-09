package com.surya.livescore.models

data class Matchinfo(
    val seriesName:String,
    val matchDesc:String,
    val matchFormat:String,
    val startDate:String,
    val endDate:String,
    val state:String,
    val status:String,
    val team1:List<Team>

)
