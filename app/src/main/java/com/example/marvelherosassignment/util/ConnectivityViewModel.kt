package com.example.marvelherosassignment.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConnectivityViewModel(private val repository: ConnectivityRepository) : ViewModel() {

    private val _internetState = MutableLiveData<Boolean>()
    val internetState: LiveData<Boolean> get() = _internetState

    fun checkInternetAvailability() {
        val isConnected = repository.isInternetAvailable()
        _internetState.postValue(isConnected)
    }
}
