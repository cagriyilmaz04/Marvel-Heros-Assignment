package com.example.marvelherosassignment.model.characters

data class Data(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<com.example.marvelherosassignment.model.characters.ResultCharacters>
)