package com.example.myapplication.collections

import com.example.myapplication.utils.Fruits
import com.example.myapplication.utils.Response
import com.example.myapplication.utils.filter2
import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.mix
import java.util.Collections

    fun main() {
        fruitsList.filter { it.isGreen }.map { it.type }
            .also { println("filter map Example 1 $it") }

        mix.filterIsInstance<Response>().filter { it.isOpen }
            .also { println("filterInstanceFilter $it") }


        val mutableSomething = fruitsList.filter { it.isGreen }.map {
            it.copy(isGreen = false)
        }

        println("filterInstanceFilterMutableList $mutableSomething")


        (0..30).toList().filter2 { it % 2 == 0 }.also { println("my first lambda $it") }

        val array3 = arrayOf(0, 0, 1, 2, 1).toMutableList()
        val newArray = array3.filter {
            Collections.frequency(array3, it) == 1
        }
        newArray.forEach { println("Solo element $it") }

    }
