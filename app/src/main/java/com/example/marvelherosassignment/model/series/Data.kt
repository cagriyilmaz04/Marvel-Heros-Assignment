package com.example.marvelherosassignment.model.series

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<com.example.marvelherosassignment.model.series.ResultSeries>,
    val total: Int
)