package com.example.myapplication

/// Also you can run another function instead of just use the println
fun String?.areYouGonnaAcceptit() = this?.toInt()
    ?: run { println("Are You Gonna Accept it = Ooopps") }