package com.surya.livescore.api

import com.surya.livescore.Keys
import com.surya.livescore.models.Cricket
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {
    @Headers(
        "X-RapidAPI-Key: ${Keys.RAPID_API_KEY}",
        "X-RapidAPI-Host: unofficial-cricbuzz.p.rapidapi.com"
    )
    @GET("/matches/list?matchState=recent")
    suspend fun getMatches(): Response<Cricket>
}