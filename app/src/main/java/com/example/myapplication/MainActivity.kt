package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

///Create repository and name it kotlin tool box
data class Response(
    val isOpen: Boolean, val change: Int
)

data class Fruits(
    val type: String, val isGreen: Boolean
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = listOf(25, 25, -1, 25, 5, 5, 25, -1, 25, 25, 25, 25, 1, 25, 25, 25, 10, 4, 2)
        val ticketPrice = 80

        val elemets = listOf(
            Response(false, 30), Response(true, 5), Response(false, 35), Response(true, 35)
        )

        elemets.distinct().also { println("distinctObjects = $it") }
        listOf<Int>(0, 1, 1, 1, 2, 2, 3).distinct().also { println("distinctNumbers = $it") }
        elemets.distinctBy { it.change }
            .also { println("distinctByObjects = $it") }/// remove repetitive elements, just keep one with the change

        val elemets2 = listOf(
            Response(false, 30), Response(true, 5), Response(false, 35), Response(true, 30)
        )

        elemets2.map { it.change.isEven2() }.also { list ->
            list.forEach {
                println("isEven? = $it")
            }
        }



        listOf(elemets, elemets2).flatten().filter { it.change == 35 }.map { it.isOpen }
            .also { println("flatten = $it") }
        val isEvenNumber = input.filter(::isEven)
            .map { it.times(4) }// filter the elements if there is any even numbers and then emit the items times 4
        val isEvenNumber2 = input.filter { it.isEven2() }
            .map { it.times(4) }/// filter the elements if there is any even numbers and then emit the items times 4
        val isTrue = elemets.filter { it.isTrue() }
            .map { it.change }/// filter the objects that has true and then emit the change value
        val list2 = (0..19).toList()
            .reversed()/// create a list of between the numbers in the range and the reverse the order
        "world".toList()/// convert an string in to list
        val list =
            List(5) { idx -> "No. $idx" }// create a list with the index 0..5 and create No. 1 No. 2
        (0..19).toMutableList()
            .removeAll { it > 10 }/// remove the elements that satisfy the condition inside the lambda
        generateSequence {
            Random.nextInt(100).takeIf { it > 30 }
        }.toList()
            .also { println("generateSequence = $it") }// need to figuer out what tha hell take if does
        elemets.filter { it.change > 30 }.also { println("Another filter example = $it") }
//        (0..90).takeIf { it > 90 }.also { println("Another take if Example = $it") }
        val m = mutableListOf(0, 1, 1, 2, 2)

        m.remove(1)
        println("remove example $m")
        m.removeAll { it == 1 }
        println("remove example $m")
        m.removeIf { it.isEven2() }
        println("remove example $m")

        val mi = mutableListOf(0, 1, 1, 2, 2)
        mi.subList(1, 2)
            .also { println("creating a sublist of the m List $it") }


//        m.takeIf { it > 1 }
//        (0..90).forEach {
//            if (it > 70) {
//            }
//        }
        input.sorted().also { println("Sorted = $it") } /// order the elements in the list
        mutableListOf(
            'a', 'b', '0', '2'
        ).retainAll { it.isLetter() }/// retain the elements that is a letter
        val mutable = mutableListOf<Char>()
        mutableListOf(
            "BANANAS", "bananas", "Bananas", "BaNanas", "MANZANA", "manzana"
        ).distinctBy { it.uppercase() }.also { list -> repeat(4) { println("DistinctBy = $list") } }


        null.areYouGonnaAcceptit()

        arrayOf(-4, 3, -9, 0, 4, 1).plusMinus().also { println("plus minus = $it") }

        val fruitsList = mutableListOf(
            Fruits("2.png", false),
            Fruits("1.png", true),
            Fruits("3", true),
            Fruits("5", true),
            Fruits("6.png", true),
            Fruits("6", true),
            Fruits("7", true),
            Fruits("8.png", false),
            Fruits("8", false),
            Fruits("8.png", false),
        )

        fruitsList.filter { it?.type == "3" }
            .also { println("fruitListFilter = $it") }//// sortedBy order the elements in the list
        fruitsList.any { it?.type.equals("2") }.also { println("any example = $it") }
        fruitsList.none { it?.isGreen == true }.also { println("none example = $it") }
        fruitsList.all { it?.isGreen == true }.also { println("all example = $it") }



        fruitsList.chunked(3).forEach { parentOrder ->
            parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png").toInt().times(3)
            }.also { println("for each, sorted by $it") }
            parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png").toInt()
            }.also { println("for each, sorted by before transformation $it") }
            val element = parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png")
            }.filter { it.equals("2") }

            println("element for each $element")

        }








        fruitsList.forEach { it?.type?.removeSuffix(".png") }
            .also { println("map and removesuffix example $it") }


        fruitsList.map { it?.type?.removeSuffix(".png") }
            .also { println("remove suffix in an object = $it") }

        "Hola.jpg".removeSuffix(".jpg").also { println("remove suffix in an string = $it") }

        "___SOME___".removeSurrounding("___")
            .also { println("removeSurrounding = $it ") }///remove what is surrounding the string

        "__SOME__ELSE__THEN__".split("__")
            .also { println("split = $it") }//split remove what is before the word(we specify it with the delimeter param)

        listOf("__d__", "__e__").map { it.removeSurrounding("__") }
            .also { println("removeSurrounding advance = $it") }

        listOf("a", "b", "c", "d").slice(listOf(0, 2)).also { println("slice $it") }
        listOf("a", "b", "c", "d").slice(0..3).also { println("slice $it") }
        listOf("a", "b", "c", "d").slice(0..2 step 1).also { println("slice $it") }
        listOf("a", "b", "c", "d").slice(2 downTo 0).also { println("slice $it") }
        listOf("a", "b", "c", "d").toMutableList().remove("b").also { println("remove $it") }

        val (isGreen, isNotGreen) = fruitsList.partition {
            it?.isGreen ?: false
        } /// it helps to giveme if the elements in the list are green
        // or not in 2 diferent variables
        println("Green = $isGreen, isNotGreen = $isNotGreen")



        fruitsList.take(2)
            .also { println("take = $it") }// take the first 2 elements in the list
        fruitsList.takeLast(3)
            .also { println("takeLast = $it") }// take the last 3 elements in the list

        fruitsList.drop(2).also { println("drop = $it") }//dont take the first 2 elements
        fruitsList.dropLast(3)
            .also { println("dropLast = $it") }///dont take the last 3 elements

        val words = "The quick brown fox jumps over the lazy dog".toList()

        println(words)


//        println("list = $list")
//        println("isEven = $isEvenNumber")
//        println("isEven2 = $isEvenNumber2")
//        println("ifTrueChange = $isTrue")


//        println(diagonalDifference(arr))

//        input.isEnough(ticketPrice).forEach {
//            if (it.isOpen) println("Open Gate") else println("Not Enough")
//            if (it.change > 0) println("Your Change = ${it.change}") else println("Not Change")
//        }


        staircase(6)


    }
}

private fun Response.isTrue() = this.isOpen.equals(true)


fun Int.isEven2() = this % 2 == 0
private fun isEven(a: Int) = a % 2 == 0

fun miniMaxSum(arr: Array<Int>): Unit {
    val mutableNumberPassed = mutableListOf<Int>()
    arr.forEachIndexed { index, int ->

        arr.forEach { inner ->

        }
    }

}

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


private fun Array<Int>.plusMinus() {
    val totalNumbers = this.size.toDouble()
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zerosNumbers = 0.0
    this.forEach {
        when {
            it > 0.0 -> positiveNumbers += 1.0
            it < 0.0 -> negativeNumbers += 1.0
            else -> zerosNumbers += 1.0
        }
    }

    val medals = mapOf(
        1 to "Gold", 2 to "Silver", 3 to "Bronze"
    )


    for (value in medals.values) {

    }

    val response = Response(true, 30)
    val (isOpen, change) = response /// Destructurize the object and having two diferent values
    val intArray = (0..9).toList().toIntArray()



    println(positiveNumbers.div(totalNumbers))
    println(negativeNumbers.div(totalNumbers))
    println(zerosNumbers.div(totalNumbers))
    println(arrayOf(0, 1, 2).getSum())
    println(
        getSum2(
            20, 7, 8, *intArray
        )
    )//// if we want to pass an array to an varArg we need to specify first an spread operator *
    println(getSum2("0", "1"))
    println("Max = ${getMax(a = 50, *intArray, 2, 3)}")

}

private fun Array<Int>.getSum(): Int = this.sum()

private fun getSum2(vararg numbers: String): Int = numbers.map { it.toInt() }
    .sum()//// with vararg doesnt care the amount of strings, we can pass it as much as we want

private fun getSum2(vararg numbers: Int): Int =
    numbers.sum()//// with vararg doesnt care the amount of numbers, we can pass it as much as we want

private fun getMax(a: Int, vararg numbers: Int): Int {
    val returnNumber = numbers.toMutableList()
    returnNumber.add(a)
    return returnNumber.max()
}


fun List<Int>.isEnough(ticketPrice: Int): List<Response> {
    val mutableList = mutableListOf<Int>()
    val mutableForReturn = mutableListOf<Response>()
    this.forEach {
        when (it) {
            -1 -> {
                mutableForReturn.add(Response(false, mutableList.sum()))
                mutableList.clear()
            }

            1 -> {
                mutableForReturn.add(Response(true, 100.minus(ticketPrice)))
                mutableList.clear()
            }

            else -> {
                mutableList.add(it)
            }
        }
        if (mutableList.sum() >= ticketPrice) {
            mutableForReturn.add(Response(true, mutableList.sum().minus(ticketPrice)))
            mutableList.clear()
        }

    }
    return mutableForReturn

}

fun String?.areYouGonnaAcceptit() = this?.toInt()
    ?: run { println("Are You Gonna Accept it = Ooopps") } /// Also you can run another function instead of just use the println


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val firstDiagonal = mutableListOf<Int>()
    val secondDiagonal = mutableListOf<Int>()
    var incrementalFirstDiagonal = 0
    var decrementalSecondDiagonal = arr.size - 1
    (arr.indices).forEach {
        firstDiagonal.add(arr[incrementalFirstDiagonal][incrementalFirstDiagonal])
        secondDiagonal.add(arr[decrementalSecondDiagonal][incrementalFirstDiagonal])
        incrementalFirstDiagonal += 1
        decrementalSecondDiagonal -= 1
    }

    val firstSum = firstDiagonal.sum()
    val secondSum = secondDiagonal.sum()
    firstDiagonal.clear()
    secondDiagonal.clear()

    return kotlin.math.abs(firstSum.minus(secondSum))

}

