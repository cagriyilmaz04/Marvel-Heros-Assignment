package com.example.marvelherosassignment.model.comics

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.comics.ItemXX>,
    val returned: Int
)