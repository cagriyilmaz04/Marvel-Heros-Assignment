package com.example.marvelherosassignment.repository

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.events.Events
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.service.MarvelService
import com.example.marvelherosassignment.stories.Stories

class MarvelRepository(private val api: MarvelService) {
    suspend fun getCharacters(ts: String, apikey: String, hash: String): Character? {
        val response = api.getCharacters(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getComics(ts: String, apikey: String, hash: String) : com.example.marvelherosassignment.comics.Comics? {
        val response = api.getComics(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getEvents(ts: String, apikey: String, hash: String) : Events? {
        val response = api.getEvents(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getSeries(ts: String, apikey: String, hash: String) : Series? {
        val response = api.getSeries(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getStories(ts: String, apikey: String, hash: String) : Stories? {
        val response = api.getStories(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }
}