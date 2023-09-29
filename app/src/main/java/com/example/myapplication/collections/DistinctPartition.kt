package com.example.myapplication.collections
import com.example.myapplication.utils.bananasList
import com.example.myapplication.utils.elemets
import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.listNumbers


/// Distinct remove repetitive elements, just keep one with the change


fun main() {
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

        val (isGreen, isNotGreen) = fruitsList.partition {
            it.isGreen
        }

        println("Green = $isGreen, isNotGreen = $isNotGreen")

        val (isMore, isNot) = fruitsList.map { it.type.removeSuffix(".png") }.partition {
            it.toInt() > 1
        }

        println("isMore = $isMore, isNot = $isNot")

        mutableListOf("BANANA", "banana", "ZANAhoria", "zanahoria").distinctBy { it.lowercase() }
            .also { println("distinctBy Example $it") }/// set no work for strings, we need to use distinct by

        "Hello World everybody body".split(" ").also { println("Words Numbers ${it.size}") }
    }


