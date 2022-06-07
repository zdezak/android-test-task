package com.example.thecocktail.data.data_source.remote

import com.example.thecocktail.domain.Drink
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("random.php")
    suspend fun getUsers(): Response<Drink>
}