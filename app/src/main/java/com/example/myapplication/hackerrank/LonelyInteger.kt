package com.example.myapplication.hackerrank


fun main() {

    val a = arrayOf(1, 2, 3, 4, 3, 2, 1)
    lonelyinteger(a).also { println(it) }
}

fun lonelyinteger(a: Array<Int>): Int = a.groupingBy { it }.eachCount().entries.find { it.value == 1 }?.key ?: 0

