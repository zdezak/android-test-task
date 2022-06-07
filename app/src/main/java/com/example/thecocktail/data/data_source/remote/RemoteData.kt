package com.example.thecocktail.data.data_source.remote

import com.example.thecocktail.domain.Drink
import retrofit2.Response
import javax.inject.Inject

class RemoteData @Inject constructor(private val apiService: ApiService) {

    suspend fun getUser(): Response<Drink> = apiService.getUsers()

}