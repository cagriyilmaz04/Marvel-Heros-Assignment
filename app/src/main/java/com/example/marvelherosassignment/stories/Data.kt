package com.example.marvelherosassignment.stories

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<ResultStories>,
    val total: Int
)