package com.example.marvelherosassignment.model.characters

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.characters.Item>,
    val returned: Int
)