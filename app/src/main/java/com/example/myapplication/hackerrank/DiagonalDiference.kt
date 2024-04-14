package com.example.myapplication.hackerrank

import com.example.myapplication.utils.arrayDiagonalDiference


    fun main(){

        val firstDiagonal = mutableListOf<Int>()
        val secondDiagonal = mutableListOf<Int>()
        var incremental = 0

        (arrayDiagonalDiference.indices).forEach {
            firstDiagonal.add(arrayDiagonalDiference[incremental][incremental])
            secondDiagonal.add(arrayDiagonalDiference.reversed()[incremental][incremental])
            incremental = incremental.inc()
        }

        val firstSum = firstDiagonal.sum()
        val secondSum = secondDiagonal.sum()

        println(kotlin.math.abs(firstSum.minus(secondSum)))

    }