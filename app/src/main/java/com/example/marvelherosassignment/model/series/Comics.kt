package com.example.marvelherosassignment.model.series

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.series.İtem>,
    val returned: Int
)