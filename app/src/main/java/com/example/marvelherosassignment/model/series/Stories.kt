package com.example.marvelherosassignment.model.series

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.series.İtemXXX>,
    val returned: Int
)