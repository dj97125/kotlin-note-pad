package com.example.myapplication.collections

import com.example.myapplication.utils.elemets
import com.example.myapplication.utils.elemets2
import com.example.myapplication.utils.isEven2
import com.example.myapplication.utils.numbers

class MapFlatMapZip {



    fun givemeMap() {

        elemets2.map { it.change.isEven2() }.also { list ->
            list.forEach {
                println("isEven? = $it")
            }
        }
        listOf(elemets, elemets2).flatten().filter { it.change == 35 }.map { it.isOpen }.also { println("Map1 = $it") }
        numbers.filter { it.isEven2() }.map { it.times(4) }.also { println("Map2 = $it") }
        elemets.filter { it.isOpen }.map { it.change }.also { println("Map3 = $it") }

        val list1 = listOf<String>("A", "B")
        val list3 = listOf<String>("C", "D")
        list1.zip(list3)

        mutableListOf(0..20).zipWithNext().also { println("zipWithNext $it") }
        mutableListOf(0..20).zipWithNext { a, b -> b - a }.also { println("zipWithNext $it") }

        mutableListOf("1", "2", "BANANA", null, "ZANAHORIA").mapNotNull {
            it?.toIntOrNull()?.times(3)
        }.also { println("toIntOrNull $it") }

    }
}