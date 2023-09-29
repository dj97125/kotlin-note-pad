package com.example.myapplication.collections

import com.example.myapplication.utils.flipingTheMatrixArray

data class example(
    val number: Int,
    val name: String
)

fun main() {
    val new = flipingTheMatrixArray.flatten().sorted().reversed().slice(0..3)
    println("mutable ${new.sum()}")

    val newList = listOf<example>(
        example(18,"o"),
        example(11,"o"),
        example(22,"o"),
        example(17,"o"),
        example(12,"o"),
        example(16,"o"),
        example(13,"o"),
        example(14,"o"),
        example(15,"o"),
        example(19,"o"),
        example(21,"o"),

    ).sortedBy { it.number }




}
