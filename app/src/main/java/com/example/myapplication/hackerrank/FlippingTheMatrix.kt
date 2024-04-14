package com.example.myapplication.hackerrank

import com.example.myapplication.utils.flipingTheMatrixArray

data class example(
    val number: Int,
    val name: String
)

fun main() {
    val new = flipingTheMatrixArray.flatten().sorted().reversed().slice(0..3)
    println("mutable ${new.sum()}")




}
