package com.example.myapplication.utils

data class Response(
    val isOpen: Boolean,
    val change: Int
)

data class Fruits(
    var type: String,
    var isGreen: Boolean
)