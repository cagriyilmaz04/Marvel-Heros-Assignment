package com.example.marvelherosassignment.series

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<ResultSeries>,
    val total: Int
)