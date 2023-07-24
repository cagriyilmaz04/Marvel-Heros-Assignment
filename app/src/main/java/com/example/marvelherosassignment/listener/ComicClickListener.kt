package com.example.marvelherosassignment.listener

import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.comics.Comics
import com.example.marvelherosassignment.comics.Result

interface ComicClickListener {
    fun onClickComic(position: Int)
}