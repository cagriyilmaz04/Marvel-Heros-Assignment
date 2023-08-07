package com.example.marvelherosassignment.model.comics

data class Creators(
    val available: Int,
    val collectionURI: String,
    val items: List<com.example.marvelherosassignment.model.comics.ItemX>,
    val returned: Int
)