package com.example.marvelherosassignment.model.stories

data class Creators(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.stories.İtemX>,
    val returned: Int
)