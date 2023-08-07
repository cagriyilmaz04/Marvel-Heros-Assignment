package com.example.marvelherosassignment.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ConnectivityViewModelFactory(private val repository: ConnectivityRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ConnectivityViewModel::class.java)) {
            return ConnectivityViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
