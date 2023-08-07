package com.example.marvelherosassignment.model.stories

data class ResultStories(
    val characters: com.example.marvelherosassignment.model.stories.Characters,
    val comics: com.example.marvelherosassignment.model.stories.Comics,
    val creators: com.example.marvelherosassignment.model.stories.Creators,
    val description: String,
    val events: com.example.marvelherosassignment.model.stories.Events,
    val id: Int,
    val modified: String,
    val originalIssue: com.example.marvelherosassignment.model.stories.OriginalIssue,
    val resourceURI: String,
    val series: com.example.marvelherosassignment.model.stories.Series,
    val thumbnail: Any,
    val title: String,
    val type: String
)