package com.example.myapplication.hackerrank


fun main() {
    RepeatedString(
        s = "abcac",
        n = 10
    ).also { println(it) }

}

fun RepeatedString(s: String, n: Long):Long {
    val occurrencesInS = s.count { it == 'a' }
    val fullRepeats = n / s.length
    val remainingChars = (n % s.length).toInt()
    val occurrencesInRemaining = s.take(remainingChars).count { it == 'a' }
    return occurrencesInS * fullRepeats + occurrencesInRemaining

}