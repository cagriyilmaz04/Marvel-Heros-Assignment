package com.example.marvelherosassignment.characters

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("code")
    val code: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("attributionHTML")
    val attributionHTML: String,
    @SerializedName("attributionText")
    val attributionText: String,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("data")
    val `data`: Data
)