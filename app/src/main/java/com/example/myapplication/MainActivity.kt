package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.objects.FlippingTheMatrix
import com.example.myapplication.objects.Fruits
import com.example.myapplication.objects.Response
import java.util.Collections
import kotlin.random.Random
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

class MainActivity : AppCompatActivity() {
    @OptIn(ExperimentalTime::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        FizzOrBuzz().fizzBuzz(15)
//        MilitaryTimeConverter().convertToMilitaryTime("12:45:54PM")

//        Distinct().distinctElements()

        FlippingTheMatrix().main()

        ComparisonSorting().giveMesort()


        val input = listOf(25, 25, -1, 25, 5, 5, 25, -1, 25, 25, 25, 25, 1, 25, 25, 25, 10, 4, 2)
        val ticketPrice = 80


        val elemets = listOf(
            Response(true, 30), Response(true, 5), Response(false, 35), Response(true, 30)
        )
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
        val new = "world".toList()
        val something = new.take(3).toString().also { println("help $it") }
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

        input.sorted().also { println("Sorted = $it") } /// order the elements in the list
        mutableListOf(
            'a', 'b', '0', '2'
        ).retainAll { it.isLetter() }/// retain the elements that is a letter
        val mutable = mutableListOf<Char>()


        val example = "f 3".toList()
        val mutablelis12 = mutableListOf<String>()

        if (example.first().equals('f')) {
            mutablelis12.add(example[1].toString())
        }
        println("mutable $mutablelis12")
        val list235 = listOf(1, 2, 3, 4, 5)

        LinkedList().main()
        null.areYouGonnaAcceptit()

        arrayOf(-4, 3, -9, 0, 4, 1).plusMinus().also { println("plus minus = $it") }

        val mix = mutableListOf(
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
            Response(true, 30),
            Response(false, 50),
        )
        mix.filterIsInstance<Response>().filter { it.isOpen }
            .also { println("filterInstanceFilter $it") }
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

            ).distinctBy { it.type }.sortedBy { it.type }
        val newList = mutableListOf<Fruits>()
        fruitsList.forEach {
            val copy = it.copy(type = it.type.removeSuffix(".png"))
            newList.add(copy)
            it.type = it.type.removeSuffix(".png")
        }
        println("copyNewList $newList")

        fruitsList.forEach { fruits ->
            fruits.type.takeIf {
                it.toInt() > 5
            }.also { println("takeIf = $it") }
        }

        fruitsList.filter { it.isGreen }.map { it.type }.also { println("filter map $it") }

        val (isMore, isNot) = fruitsList.partition {
            it.type.toInt() > 1
        }

        val mutableSomething = mutableListOf<Fruits>()

        fruitsList.filter { it.isGreen }.forEach {
            val copy = it.copy(isGreen = false)
            mutableSomething.add(copy)
        }


        println("mutableSomething $mutableSomething")
        println("paritition isMore $isMore")
        println("paritition isNot $isNot")

        fruitsList.groupBy { it.isGreen }
            .forEach { println("groupBy Example ${it.key} -> ${it.value}") }
        fruitsList.groupBy { it.type.toInt() > 2 }
            .forEach { println("groupBy Example type ${it.key} -> ${it.value}") }
        fruitsList.groupBy(
            keySelector = { if (it.type.toInt() % 2 == 0) "Evens" else "NotEvens" },
            valueTransform = { it }
        ).also { println("CustomKeysGroupBy = $it") }
        fruitsList.groupingBy { it.type.toInt() % 2 == 0 }.eachCount()
            .also { println("groupinby = $it") }
        val arrayOfTest = arrayOf(1, 2, 2, 3, 3, 3, 3, 1).toMutableList()


        arrayOfTest.forEachIndexed { index, number ->


        }
        arrayOfTest.groupBy { Collections.frequency(arrayOfTest, it) }
            .map { it.key.coerceAtMost(3) }.also { println("groupingByTest $it") }
        fruitsList.map { it.type.toInt() }.sum().also { println("map and then sum example by $it") }

        fruitsList.associateBy { it.type }.also { println("asociate by $it") }


        fruitsList.filter { it?.type == "3" }
            .also { println("fruitListFilter = $it") }//// sortedBy order the elements in the list
        fruitsList.any { it.type.toInt().isEven2() }.also { println("is there any even = $it") }
        fruitsList.none { it.type.toInt().isEven2() }.also { println("is there not even? = $it") }
        fruitsList.all { it.type.toInt().isEven2() }
            .also { println("is there all even = $it") }/// gives an true just if all the elements are even
        fruitsList.filter { it.type.toInt() % 2 == 0 }
            .also { println("filtering is there any even $it") }


        val list1 = listOf<String>("A", "B")
        val list3 = listOf<String>("C", "D")
        list1.zip(list3)
        /**
         * 2,3,4,5 //
         * 1,3,4,5
         * 1,2,4,5
         * 1,2,3,5
         * 1,2,3,4 //
         */
        arrayOf(1, 2, 3, 4, 5, 6).forEachIndexed { index, number ->
            val mutable = mutableListOf<Int>()


        }
        mutableListOf(1, 2, 3, 4, 5, 6).chunked(4).also { println("chunked $it") }
        mutableListOf(1, 2, 3, 4, 5).windowed(4, 1).also { println("sum windowed $it") }

        mutableListOf(0..20).zipWithNext().also { println("zipWithNext $it") }
        mutableListOf(0..20).zipWithNext { a, b -> b - a }.also { println("zipWithNext $it") }
//        arrayOf(1, 2, 3, 4, 5).toMutableList().windowed(4, 1, true)
//            .also { println("windoewd1 = $it") }
        val array = arrayOf(1, 2, 3, 4, 5)



        mutableListOf(1, 2, 3, 4, 5).runningFold(1) { acc, value ->
            acc.times(value)
        }.also { println("runningFold = $it") }
        mutableListOf(1, 2, 3, 4, 5).reduce { acc, value ->
            acc.times(value)
        }
            .also { println("reduce example $it") } //// with reduce we are passing through the list times every element without repeat

        mutableListOf(1, 2, 3, null, 5).reduceOrNull { acc, value ->
            acc?.times(value ?: 1)
        }
            .also { println("reduceOrNull example $it") } //// with reduce we are passing through the list times every element without repeat

        mutableListOf(1, 2, 3, null, 5).reduceRight { acc, value ->
            acc?.times(value ?: 1)
        }
            .also { println("reduceRight example $it") } //// with reduce we are passing through the list times every element without repeat

        mutableListOf(0, 1, 1, 2, 2, 3, 4).toMutableSet().also { println("Set Example $it") }
        mutableListOf("BANANA", "banana", "ZANAhoria", "zanahoria").distinctBy { it.lowercase() }
            .also { println("Set Example $it") }/// set no work for strings, we need to use distinct by
        mutableListOf("BANANA", "APPLE", "ORANGE").fold(1) { acc, value ->
            acc.times(value.length)
        }.also { println("fold example $it") }

        val (value, timePerformance) = measureTimedValue {
            listOf(Response(true, 10), Response(true, 5), Response(true, 50))
                .groupBy { it.change > 8 }
                .map { it.value.map { child -> child.change }.sum() }
                .also { als -> println("MapSum $als") }
        }

        println("it took $timePerformance")




        mutableListOf("1", "2", "BANANA", null, "ZANAHORIA").mapNotNull {
            it?.toIntOrNull()?.times(3)
        }.also { println("toIntOrNull $it") }
        val listForAnalyze = mutableListOf(1, 2, 6, 8, 9, 3, 4)
        val countingElements = listForAnalyze.count()
        listForAnalyze.sort()
        arrayOf(1, 2, 3, 4, 4, 5, 6).groupingBy { it }.eachCount().also { println("eachCount $it") }
        listForAnalyze[countingElements.div(2)].also { println("giveMENumber in the middle $it") }
        arrayOf(1, 2, 3, 4, 5, 6).reduce { acc, i ->
            acc.times(i)
        }.also { println("reduce for times $it") }
        "asdasd".equals("", false)
        mutableListOf(1, 2, 3, 4, 5).average()
            .also { println("average example $it") }/// it gives the average of the whole list
        fruitsList.chunked(3).forEach { parentOrder ->
            parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png").toInt().times(3)
            }.also { println("for each, sorted by $it") }
            parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png").toInt()
            }.also { println("for each, sorted by before transformation $it") }
            parentOrder.map { childOrder ->
                childOrder.type.removeSuffix(".png").toInt()
            }.filter { it == 2 }
                .also { println("for each, sorted by before transformation filter $it") }

        }
        val mutable3 = mutableListOf<List<List<Fruits>>>()
        fruitsList.windowed(4, 2, true)
            .also { mutable3.add(it) }// create multiple lists of size 4 jumping 2 elements

        println("windowedExotic $mutable3")
        fruitsList.windowed(3)
            .also { println("for each, sorted by before transformation windowed $it") }/// windowed creates diferent lists from the next element saving evrey 3 items


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
            it.isGreen
        } /// it helps to giveme if the elements in the list are green
        // or not in 2 diferent variables
        println("Green = $isGreen, isNotGreen = $isNotGreen")


        val array34 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(9, 8, 9))
        val firstDiagonal = mutableListOf<Int>()
        val secondDiagonal = mutableListOf<Int>()
        array34.forEach { parent ->
            val numberElement = parent.size
            println("parent $parent")
            firstDiagonal.add(parent.first())
            firstDiagonal.add(parent.last())
            secondDiagonal.add(parent.reversed().first())
            secondDiagonal.add(parent.reversed().last())
            parent

        }
        println("firstDiagonal $firstDiagonal")
        fruitsList.take(2)
            .also { println("take = $it") }// take the first 2 elements in the list
        fruitsList.takeLast(3)
            .also { println("takeLast = $it") }// take the last 3 elements in the list

        fruitsList.drop(2).also { println("drop = $it") }//dont take the first 2 elements
        fruitsList.dropLast(3)
            .also { println("dropLast = $it") }///dont take the last 3 elements

        fruitsList.takeWhile { it.type.toInt() >= 2 }.also { println("takeWhile $it") }
        fruitsList.dropWhile { it.type.toInt() >= 2 }.also { println("dropWhile $it") }

        val words = "The quick brown fox jumps over the lazy dog".toList()

        println(words)


//        println("list = $list")
//        println("isEven = $isEvenNumber")
//        println("isEven2 = $isEvenNumber2")
//        println("ifTrueChange = $isTrue")

        val array234 = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))
        println("diagonalDiference ${diagonalDifference(array234)}")

        val array334 = arrayOf(1, 1, 3, 2, 1).toMutableList()
        val newArray234 = mutableListOf<Int>()
        array334.map { element ->
            array334.count { it == element }
        }.also { array334[0] = 0 }
        println("array334 $array334")


//        input.isEnough(ticketPrice).forEach {
//            if (it.isOpen) println("Open Gate") else println("Not Enough")
//            if (it.change > 0) println("Your Change = ${it.change}") else println("Not Change")
//        }


        staircase(6)

        (0..30).toList().filter2 { it % 2 == 0 }.also { println("my first lambda $it") }
        val arr = arrayOf(7, 69, 2, 221, 8974)

        val first = mutableListOf(arr[1], arr[2], arr[3], arr[4]).map { it.toLong() }
        val second = mutableListOf(arr[0], arr[2], arr[3], arr[4]).map { it.toLong() }
        val third = mutableListOf(arr[0], arr[1], arr[3], arr[4]).map { it.toLong() }
        val fourth = mutableListOf(arr[0], arr[1], arr[2], arr[4]).map { it.toLong() }
        val fifth = mutableListOf(arr[0], arr[1], arr[2], arr[3]).map { it.toLong() }

        val mutablethird =
            mutableListOf(
                first.sum(),
                second.sum(),
                third.sum(),
                fourth.sum(),
                fifth.sum()
            ).sorted()

        println(mutablethird.first())
        println(mutablethird.last())





        arrayOf(1, 2, 3, 4, 5).average().toInt().also { println("average $it") }
        val nuber = arrayOf(1, 2, 3, 4, 5).count()

        val array3 = arrayOf(0, 0, 1, 2, 1).toMutableList()
        val newArray = array3.filter {
            Collections.frequency(array3, it) == 1
        }
        newArray.forEach { println("Solo element $it") }

        getConsecutiveNumbers(
            arrayOf(
                1,
                2,
                2,
                2,
                3,
                4
            ).toMutableList()
        ).also { println("getConsecutive Numbers $it") }


    }

    fun getConsecutiveNumbers(srcList: List<Int>): List<List<Int>> {
        return srcList.fold(mutableListOf<MutableList<Int>>()) { acc, i ->
            if (acc.isEmpty() || acc.last().last() != i - 1) {
                acc.add(mutableListOf(i))
            } else acc.last().add(i)
            acc
        }
    }


    private inline fun List<Int>.filter2(filterFunction: (Int) -> (Boolean)): List<Int> {
        val result = mutableListOf<Int>()
        this.forEach {
            if (filterFunction(it)) {
                result.add(it)
            }
        }
        return result
    }

    private fun Response.isTrue() = this.isOpen.equals(true)


    fun Int.isEven2() = this % 2 == 0
    private fun isEven(a: Int) = a % 2 == 0


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


    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        val firstDiagonal = mutableListOf<Int>()
        val secondDiagonal = mutableListOf<Int>()
        var incremental = 0
        (arr.indices).forEach {
            firstDiagonal.add(arr[incremental][incremental])
            secondDiagonal.add(arr.reversed()[incremental][incremental])
            incremental = incremental.inc()
        }

        val firstSum = firstDiagonal.sum()
        val secondSum = secondDiagonal.sum()

        return kotlin.math.abs(firstSum.minus(secondSum))

    }
}

