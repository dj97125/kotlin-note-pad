package com.example.myapplication.collections

data class AnagramObject(
    val sorted: String,
    val word: String,
    var isAnagram: Boolean
)

class Anagram {
    fun main(args: Array<String>) {
        val mutableList = mutableListOf<AnagramObject>()
        args.groupBy { it.length }.map {
            it.toPair()
        }.forEach { map ->
            map.second.forEach {
                mutableList.add(
                    AnagramObject(
                        sorted = it.toCharArray().sorted().toString(),
                        word = it,
                        isAnagram = false
                    )
                )
            }
        }
        mutableList.forEachIndexed { index1, anagramObject1 ->
            mutableList.forEachIndexed { index2, anagramObject2 ->
                if (anagramObject1.sorted == anagramObject2.sorted && index1 != index2) {
                    anagramObject1.isAnagram = true
                }
            }
        }

        val anagramList = mutableList.groupBy(
            keySelector = { if (it.isAnagram) "isAnagram" else "isNotAnagram" },
            valueTransform = { it }
        )

        println("AnagramList $anagramList")


    }


}