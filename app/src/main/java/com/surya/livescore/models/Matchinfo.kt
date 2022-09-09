package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class Matchinfo(
    @SerializedName("seriesName")
    val seriesName: String,
    @SerializedName("matchDesc")
    val matchDesc: String,
    @SerializedName("matchFormat")
    val matchFormat: String,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("team1")
    val team1: Team,
    @SerializedName("team2")
    val team2: Team,
    @SerializedName("venueInfo")
    val venueInfo: VenueInfo,
    @SerializedName("currentBatTeamId")
    val currentBatTeamId: Int,
    @SerializedName("seriesStartDt")
    val seriesStartDate: String,
    @SerializedName("seriesEndDt")
    val seriesEndDate: String,

    )
