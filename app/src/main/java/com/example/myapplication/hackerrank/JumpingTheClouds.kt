package com.example.myapplication.hackerrank


fun main() {
    JumpingTheClouds(
        c = arrayOf(0, 0, 1, 0, 0, 1, 0) //4
    ).also{ println(it)}
    JumpingTheClouds(
        c = arrayOf(
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            0,
        )
    ).also { println(it) }
}



fun JumpingTheClouds(c: Array<Int>):Int {
    var jumps = 0
    var i = 0

    while (i < c.size - 1) {
        // Check if jumping 2 clouds ahead is safe
        if (i + 2 < c.size && c[i + 2] == 0) {
            i += 2 // Jump 2 clouds ahead
        } else {
            i++ // Jump 1 cloud ahead
        }
        jumps++
    }

    return jumps

}