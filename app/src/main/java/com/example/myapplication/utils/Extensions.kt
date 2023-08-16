package com.example.myapplication.utils

/// Also you can run another function instead of just use the println
fun String?.areYouGonnaAcceptit() = this?.toInt()
    ?: run { println("Are You Gonna Accept it = Ooopps") }

fun Int.isEven2() = this % 2 == 0

fun Int.isFizzOrBuzz() {
    (1..this).forEach { i ->
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 && i % 5 > 0 -> println("Fizz")
            i % 5 == 0 && i % 3 > 0 -> println("Buzz")
            else -> println("$i")

        }
    }
}

fun String.giveMeMilitaryTime(value: String): String {

    var modifiedString = this

    if (modifiedString.take(2) == "12") {
        modifiedString = modifiedString.replaceRange(0..1, "00")
    }

    return if (value.equals("AM")) {
        modifiedString
    } else {
        val newMutable = modifiedString.split(":").toMutableList()

        newMutable[0] = (newMutable.first().toInt() + 12).toString()
        newMutable.joinToString(separator = ":")

    }
}

inline fun List<Int>.filter2(filterFunction: (Int) -> (Boolean)): List<Int> {
    val result = mutableListOf<Int>()
    this.forEach {
        if (filterFunction(it)) {
            result.add(it)
        }
    }
    return result
}

