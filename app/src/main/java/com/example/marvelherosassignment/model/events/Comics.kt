package com.example.marvelherosassignment.model.events

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<İtem>,
    val returned: Int
)