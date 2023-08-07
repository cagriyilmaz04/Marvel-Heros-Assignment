package com.example.marvelherosassignment.util

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class Type : Parcelable {
    CHARACTERS,COMICS,EVENTS,SERIES,STORIES
}