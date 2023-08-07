package com.example.marvelherosassignment.comics

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<ResultComics>,
    val total: Int
)