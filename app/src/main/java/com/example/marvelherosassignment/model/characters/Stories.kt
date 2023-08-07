package com.example.marvelherosassignment.model.characters

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.characters.ItemXXX>,
    val returned: Int
)