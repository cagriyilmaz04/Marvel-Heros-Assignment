package com.example.marvelherosassignment.listener

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.stories.Result
import com.example.marvelherosassignment.stories.Stories

interface StoriesClickListener {
    fun onClick(character: Result)
}