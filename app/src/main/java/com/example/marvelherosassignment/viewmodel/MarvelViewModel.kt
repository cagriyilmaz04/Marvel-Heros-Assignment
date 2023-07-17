package com.example.marvelherosassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelherosassignment.comics.Comics
import com.example.marvelherosassignment.events.Events
import com.example.marvelherosassignment.model.CharactersResponse
import com.example.marvelherosassignment.repository.MarvelRepository
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.stories.Stories
import kotlinx.coroutines.launch


class MarvelViewModel(private val repository: MarvelRepository) : ViewModel() {
    private val _characters = MutableLiveData<com.example.marvelherosassignment.characters.Character?>()
    val characters: LiveData<com.example.marvelherosassignment.characters.Character?> = _characters

    private val _comics = MutableLiveData<Comics?>()
    val comics: LiveData<Comics?> = _comics

    private val _events = MutableLiveData<Events?>()
    val events: LiveData<Events?> = _events

    private val _series = MutableLiveData<Series?>()
    val series: LiveData<Series?> = _series

    private val _stories = MutableLiveData<Stories?>()
    val stroies: LiveData<Stories?> = _stories

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

