package com.example.myapplication

import com.example.myapplication.objects.Fruits
import com.example.myapplication.objects.Response


/// Distinct remove repetitive elements, just keep one with the change

class Distinct {

    val elemets = listOf(
        Response(false, 30), Response(true, 5), Response(false, 35), Response(true, 35)
    )

    val bananasList = mutableListOf(
        "BANANAS", "bananas", "Bananas", "BaNanas", "MANZANA", "manzana"
    )

    val fruitsList = mutableListOf(
        Fruits("2.png", false),
        Fruits("1.png", true),
        Fruits("3", true),
        Fruits("5", true),
        Fruits("6.png", true),
        Fruits("6", true),
        Fruits("7", true),
        Fruits("8.png", false),
        Fruits("8", false),
        Fruits("8.png", false)
    ).distinctBy { it.type }.sortedBy { it.type }

    val listNumbers = listOf<Int>(0, 1, 1, 1, 2, 2, 3)


    fun distinctElements() {
        val newList = mutableListOf<List<List<Int>>>()
        repeat(listNumbers.size) {
            listNumbers.toMutableList().chunked(4) { it.shuffled() }.also { newList.add(it) }
        }
        val newNewList = newList.flatMap { it.distinct() }

        println("flattenList $newNewList")

        elemets.distinct().also { println("distinctObjects = $it") }

        listNumbers.distinct().also { println("distinctNumbers = $it") }

        elemets.distinctBy { it.change }.also { println("distinctByObjects = $it") }

        bananasList.distinctBy { it.uppercase() }
            .also { list -> repeat(4) { println("DistinctBy = $list") } }
    }


}