package com.example.marvelherosassignment.util

import com.example.marvelherosassignment.characters.ResultCharacters
import com.example.marvelherosassignment.comics.ResultComics
import com.example.marvelherosassignment.events.ResultEvents
import com.example.marvelherosassignment.series.ResultSeries
import com.example.marvelherosassignment.stories.ResultStories
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
    var dataCharacters : ResultCharacters?=null
    var dataComic : ResultComics? = null
    var dataEvents: ResultEvents? = null
    var dataSeries: ResultSeries?=null
    var dataStories: ResultStories?=null


}



