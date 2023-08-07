package com.example.marvelherosassignment.util

import com.example.marvelherosassignment.model.characters.ResultCharacters
import com.example.marvelherosassignment.model.comics.ResultComics
import com.example.marvelherosassignment.model.events.ResultEvents
import com.example.marvelherosassignment.model.series.ResultSeries
import com.example.marvelherosassignment.model.stories.ResultStories
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
object Methods {
    fun mergeString(extension:String, path:String):String{
        var returnedString = ""
        returnedString += extension
        returnedString += "."
        returnedString += path
        return returnedString
    }
    var dataCharacters : com.example.marvelherosassignment.model.characters.ResultCharacters?=null
    var dataComic : com.example.marvelherosassignment.model.comics.ResultComics? = null
    var dataEvents: ResultEvents? = null
    var dataSeries: com.example.marvelherosassignment.model.series.ResultSeries?=null
    var dataStories: com.example.marvelherosassignment.model.stories.ResultStories?=null


}



