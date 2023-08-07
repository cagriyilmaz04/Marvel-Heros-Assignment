package com.example.marvelherosassignment.model.characters

data class ResultCharacters(
    val id: Int,
    val name: String,
    val description: String,
    val modified: String,
    val thumbnail: com.example.marvelherosassignment.model.characters.Thumbnail,
    val resourceURI: String,
    val comics: com.example.marvelherosassignment.model.characters.Comics,
    val series: com.example.marvelherosassignment.model.characters.Series,
    val stories: com.example.marvelherosassignment.model.characters.Stories,
    val events: com.example.marvelherosassignment.model.characters.Events,
    val urls: List<com.example.marvelherosassignment.model.characters.Url>
)