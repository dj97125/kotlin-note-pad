package com.example.myapplication.collections

class StairCase {

    fun staircase(n: Int): Unit {
        (0..n.minus(1)).forEach { outer ->
            (n.minus(2) downTo outer).forEach {
                print(" ")
            }
            (0..outer).forEach {
                print("#")
            }

            println()
        }

    }
}