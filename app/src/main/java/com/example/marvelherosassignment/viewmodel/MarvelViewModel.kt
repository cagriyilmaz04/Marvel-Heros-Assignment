package com.example.marvelherosassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelherosassignment.model.comics.Comics
import com.example.marvelherosassignment.model.events.Events
import com.example.marvelherosassignment.model.CharactersResponse
import com.example.marvelherosassignment.repository.MarvelRepository
import com.example.marvelherosassignment.model.series.Series
import com.example.marvelherosassignment.model.stories.Stories
import kotlinx.coroutines.launch


class MarvelViewModel(private val repository: MarvelRepository) : ViewModel() {
    private val _characters = MutableLiveData<com.example.marvelherosassignment.model.characters.Character?>()
    val characters: LiveData<com.example.marvelherosassignment.model.characters.Character?> = _characters

    private val _comics = MutableLiveData<com.example.marvelherosassignment.model.comics.Comics?>()
    val comics: LiveData<com.example.marvelherosassignment.model.comics.Comics?> = _comics

    private val _events = MutableLiveData<Events?>()
    val events: LiveData<Events?> = _events

    private val _series = MutableLiveData<com.example.marvelherosassignment.model.series.Series?>()
    val series: LiveData<com.example.marvelherosassignment.model.series.Series?> = _series

    private val _stories = MutableLiveData<com.example.marvelherosassignment.model.stories.Stories?>()
    val stroies: LiveData<com.example.marvelherosassignment.model.stories.Stories?> = _stories

    fun getCharacters(ts: String, apikey: String, hash: String) = viewModelScope.launch {
        _characters.value = repository.getCharacters(ts, apikey, hash)
    }

    fun getComics(ts: String, apikey: String, hash: String) = viewModelScope.launch {
        _comics.value = repository.getComics(ts, apikey, hash)
    }

    fun getEvents(ts: String, apikey: String, hash: String) = viewModelScope.launch {
        _events.value = repository.getEvents(ts, apikey, hash)
    }

    fun getSeries(ts: String, apikey: String, hash: String) = viewModelScope.launch {
        _series.value = repository.getSeries(ts, apikey, hash)
    }

    fun getStories(ts: String, apikey: String, hash: String) = viewModelScope.launch {
        _stories.value = repository.getStories(ts, apikey, hash)
    }


}

