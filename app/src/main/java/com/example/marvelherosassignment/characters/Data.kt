package com.example.marvelherosassignment.characters

data class Data(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<ResultCharacters>
)