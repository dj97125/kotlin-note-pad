package com.example.myapplication.hackerrank

data class AnagramObject(
    val sorted: String,
    val word: String,
    var isAnagram: Boolean = false
)


fun main() {
    val args = arrayOf("ate", "eat", "tae", "bind", "bound", "bndou")
    val mutableList = mutableListOf<AnagramObject>()
    args.groupBy { it.length }.map { it.toPair() }.also {
        it.forEach { map ->
            map.second.forEach { toAnagramObject ->
                mutableList.add(
                    AnagramObject(
                        sorted = toAnagramObject.toCharArray().sorted().toString(),
                        word = toAnagramObject,
                    )
                )
            }
        }
        mutableList.forEachIndexed { index1, anagramObject1 ->
            mutableList.subList(index1.plus(1), mutableList.size).forEach { anagramObject2 ->
                if (anagramObject1.sorted == anagramObject2.sorted) {
                    anagramObject1.isAnagram = true
                }

            }
        }.also {
            mutableList.groupBy(
                keySelector = { anagram ->
                    if (anagram.isAnagram) "isAnagram" else "isNotAnagram"
                },
                valueTransform = { value ->
                    it
                }
            )

        }



        println("AnagramList $mutableList")


    }


}

