package com.example.marvelherosassignment.listener

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.series.Result
import com.example.marvelherosassignment.series.Series

interface SeriesClickListener {
    fun onClick(character: Result)
}