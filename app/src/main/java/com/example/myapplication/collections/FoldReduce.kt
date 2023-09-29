package com.example.myapplication.collections

data class RunningReduceIndexedObject(
    val index: Int,
    val acc: Int
)


fun main() {
    val arr124 = arrayOf(3, 3).toIntArray()


    mutableListOf("BANANA", "APPLE", "ORANGE").fold(1) { acc, value ->
        acc.times(value.length)
    }.also { println("fold example $it") }

    arr124.fold(0) { acumulator, item ->
        acumulator.plus(item)
    }
    val array = mutableListOf<Int>()
    twoSum(arr124, 6)
    arr124.runningFold(0) { acumulator, item ->
        acumulator.plus(item)
    }

    mutableListOf(1, 2, 3, 4, 5).runningFold(1) { acc, value ->
        acc.times(value)
    }.also { println("runningFold = $it") }

    val sumList = mutableListOf(1, 2, 3, 4, 5, 6, 7).reduce { acumulator, next ->
        acumulator.plus(next)
    }


    println("reduce sumList $sumList")

    val sumList4 = mutableListOf(1, 2, 3, 4, 5, 6, 7).runningReduce { acumulator, next ->
        acumulator.plus(next)
    }
    println("reduce runningReduceSumList $sumList4")

    val numbers12 = listOf(1, 2, 3, 4, 5)
    val filteredList = numbers12.fold(mutableListOf<Int>()) { accumulator, element ->
        if (element % 2 == 0) accumulator else accumulator.apply { add(element) }
    }

    val subList = mutableListOf<Char>()
    val mainList = mutableListOf<List<Char>>()
    "aaaabbbccdabxx".forEach { char ->
        when {
            char == subList.firstOrNull() || subList.isEmpty() -> subList.add(char)
            char != subList.last() -> {
                mainList.add(subList.toList())
                subList.clear()
                subList.add(char)
            }
            else -> {
                subList.add(char)
            }
        }

    }
    println(filteredList)
    println("repitable letters $mainList")

    val sumList5 =
        mutableListOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7
        ).foldIndexed(mutableListOf<RunningReduceIndexedObject>()) { index, acumulator, next ->
            acumulator.apply {
                if (next % 2 == 0) add(RunningReduceIndexedObject(index, next))
            }

        }
    println("reduce runningReduceIndexedSumList $sumList5")

    val sumList2 = mutableListOf(1, 2, 3, 4, 5, 6, 7).fold(2) { acumulator, next ->
        acumulator.plus(next)
    }
    println("reduce foldSumList $sumList2")

    val numbers = listOf(10, 5, 8, 30, 12)
    val maxNumber = numbers.reduce { accumulator, element ->
        if (element > accumulator) element else accumulator
    }
    println("reduceMaxNunber $maxNumber")


    val sumList3 = mutableListOf(1, 2, 3, 4, 5, 6, 7).runningFold(2) { acumulator, next ->
        acumulator.plus(next)
    }
    println("reduce runningFoldSumList $sumList3")

    val words = listOf("Hello", "World", "Kotlin", "Fold")
    val concatenatedString = words.reduce { accumulator, element ->
        "$accumulator $element"
    }
    println("reduceForConcatenateString $concatenatedString") // Output: "Hello World Kotlin Fold"


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
    arrayOf(1, 2, 3, 4, 5, 6).reduce { acc, i ->
        acc.times(i)
    }.also { println("reduce for times $it") }

}

private fun twoSum(nums: IntArray, target: Int) {
    val mutable = mutableListOf<Int>()
    if (nums.count() == 2) {
        if (nums.sum() == target) {
            nums.forEachIndexed { index, num ->
                mutable.add(index)
            }
        }
    } else {
        nums.toMutableList().windowed(2, partialWindows = true).also { parent ->
            parent.mapNotNull {
                it.takeIf { it.sum() == target }
            }.also {
                nums.forEachIndexed { index, num ->
                    it.flatten().forEach { element ->
                        if (element == num) mutable.add(index)
                    }
                }
            }
        }

    }
    println("twoSum $mutable")

}


