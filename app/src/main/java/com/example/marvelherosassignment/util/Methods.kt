package com.example.marvelherosassignment.util

object Methods {
    fun MergeString(extension:String,path:String):String{
        var returnedString = ""
        returnedString += extension
        returnedString += "."
        returnedString += path
        return returnedString
    }

}