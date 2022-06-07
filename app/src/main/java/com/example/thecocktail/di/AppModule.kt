package com.example.thecocktail.di

import com.example.thecocktail.data.repository.DefaultRepository
import com.example.thecocktail.data.data_source.remote.ApiService
import com.example.thecocktail.data.data_source.remote.RemoteData
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRepository(remoteData: RemoteData): DefaultRepository {
        return DefaultRepository(remoteData)
    }

    @Provides
    fun provideBaseUrl(): String =
        "https://www.thecocktaildb.com/api/json/v1/1/"

    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(BASE_URL: String, moshi: Moshi): Retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideRemoteData(apiService: ApiService): RemoteData = RemoteData(apiService)
}