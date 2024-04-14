package com.example.myapplication.collections

import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.isEven2

fun main() {
    listOf(1,1,1,1,2,3,4,5).associateBy { it.isEven2() }.also { println(it) }

    fruitsList.associateBy { it.type }.also { println("asociate by $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.any { it.toInt().isEven2() }
        .also { println("is there any even = $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.none { it.toInt().isEven2() }
        .also { println("is there any even = $it") }
    fruitsList.map { it.type.removeSuffix(".png") }.all { it.toInt().isEven2() }
        .also { println("is there any even = $it") }

    val old = List(10){ "0$it" }
    val new = (10 until 16).map{it}

    println(old + new)




}
