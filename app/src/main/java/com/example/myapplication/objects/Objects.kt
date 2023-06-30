package com.example.myapplication.objects

data class Response(
    val isOpen: Boolean,
    val change: Int
)

data class Fruits(
    var type: String,
    var isGreen: Boolean
)