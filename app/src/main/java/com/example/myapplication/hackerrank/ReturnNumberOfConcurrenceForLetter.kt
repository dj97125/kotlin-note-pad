package com.example.myapplication.hackerrank

import com.example.myapplication.Collection

fun main(){
    returnNumberOfConcurrenceForLetter()
}

fun returnNumberOfConcurrenceForLetter() {
    val args = "aaabbbdddaaaxxxaggzz"
    val currentSequence = mutableListOf<Collection>()
    var secuence = StringBuilder()
    args.forEachIndexed { index, currentChar ->
        if (index == 0 || currentChar != args[index - 1]) {
            secuence = StringBuilder()
            secuence.append(currentChar)
        } else {
            secuence.append(currentChar)
        }
        if (index == args.length - 1 || currentChar != args[index + 1]) {
            currentSequence.add(
                Collection(
                    word = secuence.toString(),
                    concurrence = secuence.length
                )
            )
        }
    }


    println("consecutiveSequences_$currentSequence")
}