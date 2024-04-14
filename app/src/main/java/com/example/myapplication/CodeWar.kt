package com.example.myapplication

import java.util.Stack
import kotlin.math.pow

data class IndexPairs(
    val index1: Int,
    val index2: Int,
    val number1: Int,
    val number2: Int,
    val sum: Int

)

fun main() {



    val list = arrayListOf(4,10,13,12,12,13,13,13)

    val maxValueInList = list.sorted().last()
    val listToFill = (0..maxValueInList).toList()
    val newList1 = listToFill.map {
        if(list.contains(it)){
            it
        } else {
            0
        }
    }.also {
        println(it)
    }
    "16:22 AM".split(":"," ").also { println(it) }
//    val newList2 = ((0..maxValueInList).toMutableList() + list).sorted().also { println(it)}
//    newList2.map { element ->
//        if(list.contains(element)){
//            element
//        } else {
//            0
//        }
//
//    }.also {
//        println(it)
//    }


//    "Hello World everybody body".split(" ").also { println("Words Numbers ${it.size}") }
    val toCamelCase = "the-last_warrior".split("-", "_").mapIndexed { index, s ->
        if (index != 0) s.replaceFirstChar { cha -> cha.titlecase() } else {
            s
        }
    }.joinToString("")


    val response = listOf(4,4,2,2,3).groupingBy { it }.eachCount().filterValues { it == 1 }.map { it.key }.first()
    println(response)

    val justWords = "\\w+".toRegex()
    val justLetters = "\\p{Alpha}+".toRegex()
    justLetters.findAll("krish21an").map { it.value }.joinToString().reversed().replace(" ,", "")
        .also { println(it) }


//    "23123sdfsdf21323".count { it.isDigit() }.also { println(it) }

//    println(makeNegative(42))
//    println(toCamelCase)
//    println(TwoSum.twoSum(intArrayOf(2,2,3), 4))
//    println(FixStringCase.solve("CODe"))


    "        Hola    PM".trim().also { println(it) }
    " H o l a".also { println(it) }
    """
    well
    multyline
    string
    """.trimIndent().lines().also { println(it) }



//    findSmallestInt(listOf(34, -345, -1, 100)).also { println(it) }
//    hexStringToRGB("#FF9933").also { println(it) }
//    digPow(46288, 5).also { println(it) }
//    persistence(25).also { println(it) }
//    duplicateCount("Indivisibilities")
    dirReduc(
        arrayOf("NORTH", "WEST", "SOUTH", "EAST")
    ).also { println(it) }



}








fun makeNegative(x: Int): Int = if (x.toString().first() == '-') x else -x

// If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse
// otherwise rotate it to the left by one position
data class PairResult(
    val squaredSumNumbers: Int,
    val rawNumbers: String,
)

fun revRot(nums: String, sz: Int): String =
    nums.chunked(sz).filter { it.length == sz }.joinToString("") {
        when {
            it.sumOf { c ->
                c.toString().toDouble().pow(3).toInt()
            } % 2 != 0 -> it.drop(1) + it.first()

            it.isBlank() -> ""
            else -> it.reversed()
        }

    }

//fun findSmallestInt(nums: List<Int>): Int = nums.min().toInt()

fun findSmallestInt(nums: List<Int>): Int? = nums.minOrNull()?.toInt()

data class RGB(val r: Int, val g: Int, val b: Int)

fun hexStringToRGB(hexString: String): RGB = RGB(
    r = hexString.slice(1..2).toInt(16),
    g = hexString.slice(3..4).toInt(16),
    b = hexString.takeLast(2).toInt(16)
)


object FixStringCase {

    fun solve(s: String): String {
        s.count { it.isUpperCase() }.also {
            return if (it > s.length.minus(it)) s.uppercase() else s.lowercase()
        }

    }

}


object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
        numbers.forEachIndexed { index1, element1 ->
            numbers.forEachIndexed { index2, element2 ->
                if (index1 != index2 && element1.plus(element2) == target) {
                    return Pair(index1, index2)
                }
            }
        }

        throw IllegalArgumentException()
    }
}

fun digPow(n: Int, p: Int): Int {
    val listValues = n.toString().toMutableList()
    val multiples = List(n.toString().toMutableList().size) { p.plus(it) }

    val sum = listValues.mapIndexed { index1, num1 ->
        multiples.mapIndexed { index2, mult ->
            if (index1 == index2) {
                num1.toString().toDouble().pow(mult).toInt()
            } else {
                null
            }
        }.filterNotNull()
    }.flatten().sum()

    val const = sum.div(n)

    return when {
        sum % n == 0 -> const
        else -> -1
    }


}

fun persistence(num: Int, count: Int = 0): Int =
    if (num < 9) count else persistence(num.toString().map { it.toString().toInt() }
        .reduce { acc, i -> acc.times(i) }, count = count.inc())

fun duplicateCount(text: String): Int {
    text.lowercase().groupingBy { it }.eachCount().map {
        it.value.takeIf { ocurr ->
            ocurr > 1
        }
    }.filterNotNull().also {
        return it.size
    }
}

fun dirReduc(arr: Array<String>): Array<String> {
    val s = Stack<String>()
    arr.forEach {
        when (it) {
            "NORTH" -> if (s.isNotEmpty() && s.peek() == "SOUTH") s.pop() else s.push(it)
            "SOUTH" -> if (s.isNotEmpty() && s.peek() == "NORTH") s.pop() else s.push(it)
            "EAST" -> if (s.isNotEmpty() && s.peek() == "WEST") s.pop() else s.push(it)
            "WEST" -> if (s.isNotEmpty() && s.peek() == "EAST") s.pop() else s.push(it)
        }
    }

    return s.toList().toTypedArray()
}




//fun dirReduc(arr: Array<String>): Array<String> {
//    val stack = mutableListOf<String>()
//    arr.forEach {
//        if(stack.isNotEmpty() && stack.last().isOpposite(it) ){
//            stack.removeLast()
//        } else {
//            stack.add(it)
//        }
//    }
//    return stack.toTypedArray()
//
//}
//
//fun String.isOpposite(direction: String): Boolean{
//    return when (this) {
//        "NORTH" -> direction == "SOUTH"
//        "SOUTH" -> direction == "NORTH"
//        "EAST"  -> direction == "WEST"
//        "WEST"  -> direction == "EAST"
//        else    -> false
//    }
//}


//object TwoSum {
//    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
//        val possibleSums = mutableListOf<IndexPairs>()
//        numbers.forEachIndexed { index1, element1 ->
//            numbers.forEachIndexed { index2, element2 ->
//                if (index1 != index2) {
//                    val firstEelement = IndexPairs(
//                        index1 = index1,
//                        index2 = index2,
//                        number1 = element1,
//                        number2 = element2,
//                        sum = element1.plus(element2)
//                    )
//                    possibleSums.add(firstEelement)
//
//                }
//            }
//        }
//        return possibleSums.mapNotNull { it.takeIf { it.sum == target } }
//            .map { Pair(it.index1, it.index2) }.first()
//    }
//}

data class Collection(
    val word: String,
    val concurrence: Int
)




