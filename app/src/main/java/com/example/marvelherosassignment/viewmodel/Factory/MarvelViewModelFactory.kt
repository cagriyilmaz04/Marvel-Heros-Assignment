package com.example.marvelherosassignment.viewmodel.Factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.marvelherosassignment.repository.MarvelRepository
import com.example.marvelherosassignment.viewmodel.MarvelViewModel

class MarvelViewModelFactory(private val repository: MarvelRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MarvelViewModel::class.java)) {
            return MarvelViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
