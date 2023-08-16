package com.example.myapplication.collections

import com.example.myapplication.utils.Fruits
import com.example.myapplication.utils.Response
import com.example.myapplication.utils.filter2
import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.mix
import java.util.Collections

class Filter {

    fun giveMeFilter(){
        fruitsList.filter { it.isGreen }.map { it.type }.also { println("filter map Example 1 $it") }

        mix.filterIsInstance<Response>().filter { it.isOpen }
            .also { println("filterInstanceFilter $it") }

        val mutableSomething = mutableListOf<Fruits>()

        fruitsList.filter { it.isGreen }.forEach {
            val copy = it.copy(isGreen = false)
            mutableSomething.add(copy)
        }

        println("filterInstanceFilter $mutableSomething")


        (0..30).toList().filter2 { it % 2 == 0 }.also { println("my first lambda $it") }

        val array3 = arrayOf(0, 0, 1, 2, 1).toMutableList()
        val newArray = array3.filter {
            Collections.frequency(array3, it) == 1
        }
        newArray.forEach { println("Solo element $it") }

    }
}