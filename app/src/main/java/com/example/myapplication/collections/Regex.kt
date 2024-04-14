package com.example.myapplication.collections

fun main() {
    val str = "the-stealth_warrior"
    val wordRegex = "[#,%&*{}/:<>?|-]".toRegex()
    val new = str.replace(wordRegex, " ").split(" ")
    val list = new.takeLast(new.size.minus(1)).map {
        it.replaceFirstChar {cha ->
            cha.titlecase()
        }
    }.joinToString (separator = "")
    println(new.first() + list)

    val justWords = "\\w+".toRegex()
    val justLetters = "\\p{Alpha}+".toRegex()

    "ultr53o?n".reversed().filter { it.isLetter() }

    val otherAlternative = str.split("-","_").mapIndexed { index, s -> if(index!= 0 ) s.replaceFirstChar{ cha -> cha.titlecase()} else { s }  }.joinToString("")
    println(otherAlternative)
}