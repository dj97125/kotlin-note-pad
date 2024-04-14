package com.example.myapplication

fun main() {
    val greet: StringBuilder.() -> Unit = { append("Hello") }

    val greeting: () -> Unit = {
        println("Lambda")
    }
    val sum = { a: Int, b: Int -> a + b }
    val square: (Int) -> Int = { x -> x.times(x) }
    val sayHiExplicit: () -> Unit = { println("Hi") }
    applyGreeting(greet).also { println(it)}


    println(sum(5, 10))
    println(square(5))

    sayHiExplicit()
    greeting()


}

fun applyGreeting(greet: StringBuilder.() -> Unit): StringBuilder {
    val builder = StringBuilder()
    builder.greet()
    return builder
}