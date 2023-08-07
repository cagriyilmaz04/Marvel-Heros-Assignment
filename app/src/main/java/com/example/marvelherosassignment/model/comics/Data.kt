package com.example.marvelherosassignment.model.comics

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<com.example.marvelherosassignment.model.comics.ResultComics>,
    val total: Int
)