package com.example.marvelherosassignment.service

import com.example.marvelherosassignment.model.characters.Character
import com.example.marvelherosassignment.model.comics.Comics
import com.example.marvelherosassignment.model.events.Events
import com.example.marvelherosassignment.model.CharactersResponse
import com.example.marvelherosassignment.model.series.Series
import com.example.marvelherosassignment.model.stories.Stories
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {
    @GET("v1/public/characters")
    suspend fun getCharacters(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<com.example.marvelherosassignment.model.characters.Character>

    @GET("v1/public/comics")
    suspend fun getComics(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<com.example.marvelherosassignment.model.comics.Comics>

    @GET("v1/public/events")
    suspend fun getEvents(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<Events>

    @GET("v1/public/series")
    suspend fun getSeries(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<com.example.marvelherosassignment.model.series.Series>

    @GET("v1/public/stories")
    suspend fun getStories(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<com.example.marvelherosassignment.model.stories.Stories>

}
