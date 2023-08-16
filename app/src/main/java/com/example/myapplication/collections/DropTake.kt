package com.example.myapplication.collections

import com.example.myapplication.utils.Fruits
import com.example.myapplication.utils.fruitsList
import kotlin.random.Random

class DropTake {

    fun giveMeDropTake() {
        fruitsList.take(2)
            .also { println("take = $it") }// take the first 2 elements in the list
        fruitsList.takeLast(3)
            .also { println("takeLast = $it") }// take the last 3 elements in the list

        fruitsList.drop(2).also { println("drop = $it") }//dont take the first 2 elements
        fruitsList.dropLast(3).also { println("dropLast = $it") }///dont take the last 3 elements


        val modifiedList = fruitsList.map {
            Fruits(it.type.removeSuffix(".png"), it.isGreen)
        }

        modifiedList.takeWhile { it.type.toInt() == 2 }
        println("takeWhile $modifiedList")


        modifiedList.dropWhile { it.type.toInt() == 2 }
        println("dropWhile $modifiedList")

        "world".take(3).also { println("help $it") }

        generateSequence { Random.nextInt(100).takeIf { it > 30 } }.toList()
            .also { println("takeIf1 = $it") }

        (0 until 1000).toMutableList().mapNotNull { parent ->
            parent.takeIf {
                it > 20
            }
        }.map { it.toFloat() }.also { println("takeIf2 = $it") }

        (0 until 3).toMutableList().getOrNull(5).also { println("getOrNull $it") }
        (0 until 3).toMutableList().getOrElse(5) {
            println("thereIsNotIndex in getOrElse")
        }.also { println("getOrElse $it") }
    }
}