package com.example.marvelherosassignment.model.events

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<ResultEvents>,
    val total: Int
)