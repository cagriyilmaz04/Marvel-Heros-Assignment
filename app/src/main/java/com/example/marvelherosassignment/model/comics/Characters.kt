package com.example.marvelherosassignment.model.comics

data class Characters(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.comics.Item>,
    val returned: Int
)