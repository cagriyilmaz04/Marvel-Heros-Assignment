package com.example.marvelherosassignment.service

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.comics.Comics
import com.example.marvelherosassignment.events.Events
import com.example.marvelherosassignment.model.CharactersResponse
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.stories.Stories
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {
    @GET("v1/public/characters")
    suspend fun getCharacters(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<Character>

    @GET("v1/public/comics")
    suspend fun getComics(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<Comics>

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
    ): Response<Series>

    @GET("v1/public/stories")
    suspend fun getStories(
        @Query("ts") timestamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<Stories>

}
