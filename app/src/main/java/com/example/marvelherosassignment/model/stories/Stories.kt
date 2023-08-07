package com.example.marvelherosassignment.model.stories

data class Stories(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: com.example.marvelherosassignment.model.stories.Data,
    val etag: String,
    val status: String
)