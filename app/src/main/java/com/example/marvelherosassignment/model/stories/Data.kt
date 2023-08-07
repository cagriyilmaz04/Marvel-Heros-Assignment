package com.example.marvelherosassignment.model.stories

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<com.example.marvelherosassignment.model.stories.ResultStories>,
    val total: Int
)