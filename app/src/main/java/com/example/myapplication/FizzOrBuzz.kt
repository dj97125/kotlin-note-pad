package com.example.myapplication

class FizzOrBuzz {
    fun fizzBuzz(n: Int): Unit {
        n.isFizzOrBuzz()

    }
    private fun Int.isFizzOrBuzz() {
        (1..this).forEach { i ->
            when {
                i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
                i % 3 == 0 && i % 5 > 0 -> println("Fizz")
                i % 5 == 0 && i % 3 > 0 -> println("Buzz")
                else -> println("$i")

            }
        }
    }
}

