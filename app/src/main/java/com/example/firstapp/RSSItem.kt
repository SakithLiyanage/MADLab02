package com.example.firstapp

data class RSSItem(
    val title : String,
    val text : String,
    val type : RSSType,
    val media : Int ?= null
)

enum class RSSType{
    TEXT,
    VIDEO,
    IMAGE
}
