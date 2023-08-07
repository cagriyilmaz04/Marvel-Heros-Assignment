package com.example.marvelherosassignment.model.series

data class Series(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: com.example.marvelherosassignment.model.series.Data,
    val etag: String,
    val status: String
)