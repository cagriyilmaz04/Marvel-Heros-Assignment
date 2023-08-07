package com.example.marvelherosassignment.model.events

data class Series(
    val available: Int,
    val collectionURI: String,
    val items: List<İtem>,
    val returned: Int
)