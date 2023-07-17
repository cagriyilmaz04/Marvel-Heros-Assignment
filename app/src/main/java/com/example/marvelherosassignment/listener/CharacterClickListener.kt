package com.example.marvelherosassignment.listener

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.characters.Result

interface CharacterClickListener {
    fun onClick(character:Result)
}