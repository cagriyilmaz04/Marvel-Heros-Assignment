package com.example.marvelherosassignment.repository

import com.example.marvelherosassignment.model.characters.Character
import com.example.marvelherosassignment.model.events.Events
import com.example.marvelherosassignment.model.series.Series
import com.example.marvelherosassignment.service.MarvelService
import com.example.marvelherosassignment.model.stories.Stories

class MarvelRepository(private val api: MarvelService) {
    suspend fun getCharacters(ts: String, apikey: String, hash: String): com.example.marvelherosassignment.model.characters.Character? {
        val response = api.getCharacters(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getComics(ts: String, apikey: String, hash: String) : com.example.marvelherosassignment.model.comics.Comics? {
        val response = api.getComics(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getEvents(ts: String, apikey: String, hash: String) : Events? {
        val response = api.getEvents(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getSeries(ts: String, apikey: String, hash: String) : com.example.marvelherosassignment.model.series.Series? {
        val response = api.getSeries(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun getStories(ts: String, apikey: String, hash: String) : com.example.marvelherosassignment.model.stories.Stories? {
        val response = api.getStories(ts, apikey, hash)
        return if (response.isSuccessful) response.body() else null
    }
}