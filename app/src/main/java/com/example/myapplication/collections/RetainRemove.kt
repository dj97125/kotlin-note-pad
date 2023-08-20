package com.example.myapplication.collections

import com.example.myapplication.utils.fruitsList


fun main() {


    fruitsList.chunked(3).forEach { parentOrder ->
        parentOrder.map { childOrder ->
            childOrder.type.removeSuffix(".png").toInt().times(3)
        }.also { println("removeExample6 $it") }
    }
    mutableListOf(
        'a', 'b', '0', '2'
    ).apply { retainAll { it.isLetter() } }
        .also { println("removeExample1 $it") }/// retain the elements that is a letter

        val numbers1 = (0 until 20).toMutableList()
        numbers1.apply { removeAll { it > 10 } }.also { println("removeExample2 $it") }
        val numbers2 = (0 until 20).toMutableList()
        numbers2.apply { remove(1) }.also { println("removeExample3 $it") }
        val numbers3 = (0 until 20).toMutableList()
        numbers3.apply { removeAll { it == 1 } }.also { println("removeExample4 $it") }


        val numbers5 = (0 until 20).toMutableList()
        numbers5.apply { removeAll { it % 2 != 0 } }.also { println("removeExample5 $it") }
        val numbers8 = (0 until 20).toMutableList()
        numbers8.filterNot {  it % 2 != 0  }.also { println("removeExample5FilterNot $it") }
        val numbers7 = (0 until 20).toMutableList()
        numbers7.apply { removeIf { it % 2 != 0 } }.also { println("removeExample8 $it") }

        val numbers4 = (0 until 20).toMutableList()
        numbers4.apply { removeAll { it % 2 == 0 } }.also { println("removeExample6 $it") }
        val numbers9 = (0 until 20).toMutableList()
        numbers9.filter {  it % 2 == 0 }.also { println("removeExample6Filter $it") }
        val numbers10 = (0 until 20).toMutableList()
        numbers10.apply{retainAll {  it % 2 == 0 }}.also { println("removeExample6RetainAll $it") }
        val numbers6 = (0 until 20).toMutableList()
        numbers6.apply { removeIf { it % 2 == 0 } }.also { println("removeExample7 $it") }



    }
