package com.surya.livescore.models

data class Matchinfo(
    val seriesName: String,
    val matchDesc: String,
    val matchFormat: String,
    val startDate: String,
    val endDate: String,
    val state: String,
    val status: String,
    val team1: Team,
    val team2: Team,
    val venueInfo: VenueInfo,
    val currentBatTeamId: Int,
    val seriesStartDate: String,
    val seriesEndDate: String,
    )
