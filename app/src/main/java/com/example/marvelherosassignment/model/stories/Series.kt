package com.example.marvelherosassignment.model.stories

data class Series(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.stories.İtem>,
    val returned: Int
)