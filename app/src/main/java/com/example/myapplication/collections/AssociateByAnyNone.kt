package com.example.myapplication.collections

import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.isEven2

fun main() {

    fruitsList.associateBy { it.type }.also { println("asociate by $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.any { it.toInt().isEven2() }
        .also { println("is there any even = $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.none { it.toInt().isEven2() }
        .also { println("is there any even = $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.all { it.toInt().isEven2() }
        .also { println("is there any even = $it") }


    "aaaabbbccdabxx".toMutableList().chunked(4).groupingBy { it }.eachCount().forEach { counting ->
        println(counting)
    }

}
