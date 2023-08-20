package com.example.myapplication.collections

import com.example.myapplication.utils.Fruits
import com.example.myapplication.utils.Response
import com.example.myapplication.utils.fruitsList
import java.util.Collections
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

class GrupBy {
    @OptIn(ExperimentalTime::class)

    fun giveMeGrroupBy() {
        fruitsList.groupBy { it.isGreen }
            .forEach { println("groupBy Example ${it.key} -> ${it.value}") }

        val fruitListNoPng = fruitsList.map {
            Fruits(it.type.removeSuffix(".png"), it.isGreen)
        }



        fruitListNoPng.groupBy { it.type.toInt() > 2 }
            .forEach { println("groupBy Example type ${it.key} -> ${it.value}") }

        fruitListNoPng.groupBy(
            keySelector = { if (it.type.toInt() % 2 == 0) "Evens" else "NotEvens" },
            valueTransform = { it }
        ).also { println("CustomKeysGroupBy = $it") }

        fruitListNoPng.groupingBy { it.type.toInt() % 2 == 0 }.eachCount()
            .also { println("groupinby = $it") }

        val arrayOfTest = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)

        arrayOfTest.groupingBy { it }.eachCount()
            .mapNotNull { it.value.div(2)}.sum()
            .also { println("groupingBy eachCount $it") }

        arrayOfTest.groupBy {
            Collections.frequency(arrayOfTest.toMutableList(), it) }
            .map { it.key.coerceAtMost(3) }.also { println("groupingByTest $it") }


        val (value, timePerformance) = measureTimedValue {
            listOf(Response(true, 10), Response(true, 5), Response(true, 50))
                .groupBy { it.change > 8 }
                .map { it.value.map { child -> child.change }.sum() }
                .also { als -> println("MapSum $als") }
        }

        println("it took $timePerformance")

    }
}