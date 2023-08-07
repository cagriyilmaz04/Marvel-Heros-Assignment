package com.example.marvelherosassignment.model.series

data class ResultSeries(
    val characters: com.example.marvelherosassignment.model.series.Characters,
    val comics: com.example.marvelherosassignment.model.series.Comics,
    val creators: com.example.marvelherosassignment.model.series.Creators,
    val description: String,
    val endYear: Int,
    val events: com.example.marvelherosassignment.model.series.Events,
    val id: Int,
    val modified: String,
    val next: com.example.marvelherosassignment.model.series.Next,
    val previous: Any,
    val rating: String,
    val resourceURI: String,
    val startYear: Int,
    val stories: com.example.marvelherosassignment.model.series.Stories,
    val thumbnail: com.example.marvelherosassignment.model.series.Thumbnail,
    val title: String,
    val type: String,
    val urls: List<com.example.marvelherosassignment.model.series.Url>
)