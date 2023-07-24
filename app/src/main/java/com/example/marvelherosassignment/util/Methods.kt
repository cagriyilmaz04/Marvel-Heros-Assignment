package com.example.marvelherosassignment.util

object Methods {
    fun MergeString(extension:String,path:String):String{
        var returnedString = ""
        returnedString += extension
        returnedString += "."
        returnedString += path
        return returnedString
    }
    var dataCharacters : com.example.marvelherosassignment.characters.Result ?=null
    var dataComic : com.example.marvelherosassignment.comics.Result? = null
    var dataEvents: com.example.marvelherosassignment.events.Result? = null
    var dataSeries: com.example.marvelherosassignment.series.Result?=null
    var dataStories: com.example.marvelherosassignment.stories.Result?=null

}