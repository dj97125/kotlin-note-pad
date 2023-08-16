package com.example.myapplication.collections

import com.example.myapplication.utils.Fruits
import com.example.myapplication.utils.fruitsList

class WindowedChunkedSlice {
    val mutable3 = mutableListOf<List<List<Fruits>>>()
    fun giveMeWindowedChunked() {
        listOf("a", "b", "c", "d").slice(listOf(0, 2)).also { println("slice1 $it") }
        listOf("a", "b", "c", "d").slice(0..3).also { println("slice2 $it") }
        listOf("a", "b", "c", "d").slice(0..2 step 1).also { println("slice3 $it") }
        listOf("a", "b", "c", "d").slice(2 downTo 0).also { println("slice4 $it") }
        fruitsList.windowed(4, 2, true)
            .also { mutable3.add(it) }// create multiple lists of size 4 jumping 2 elements

        println("windowedExotic $mutable3")
        fruitsList.windowed(3)
            .also { println("for each, sorted by before transformation windowed $it") }

        mutableListOf(1, 2, 3, 4, 5, 6).chunked(4).also { println("chunked $it") }
        mutableListOf(1, 2, 3, 4, 5).windowed(4, 1).also { println("sum windowed $it") }

    }
}