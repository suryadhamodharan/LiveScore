package com.surya.livescore.models

import com.google.gson.annotations.SerializedName

data class MatchInfo(
    @SerializedName("currentBatTeamId")
    val currentBatTeamId: Int?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("matchDesc")
    val matchDesc: String?,
    @SerializedName("matchFormat")
    val matchFormat: String?,
    @SerializedName("matchId")
    val matchId: Int?,
    @SerializedName("seriesEndDt")
    val seriesEndDt: String?,
    @SerializedName("seriesId")
    val seriesId: Int?,
    @SerializedName("seriesName")
    val seriesName: String?,
    @SerializedName("seriesStartDt")
    val seriesStartDt: String?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("team1")
    val team1: Team?,
    @SerializedName("team2")
    val team2: Team?,
    @SerializedName("venueInfo")
    val venueInfo: VenueInfo?
)