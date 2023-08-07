package com.example.marvelherosassignment.model.comics

data class Comics(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: com.example.marvelherosassignment.model.comics.Data,
    val etag: String,
    val status: String
)