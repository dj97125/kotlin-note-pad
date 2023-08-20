package com.example.myapplication

class Lambdas {
    val greet: StringBuilder.() -> Unit = { append("Hello")}

    fun applyGreeting(greet: StringBuilder.() -> Unit): StringBuilder {
        val builder = StringBuilder()
        builder.greet()
        return builder
    }
    fun main(){
        val greeting:() -> Unit = {
            println("Lambda")}
        val sum = {a:Int,b:Int -> a + b}
        val square : (Int) -> Int = {x -> x.times(x)}
        val sayHiExplicit:() -> Unit = { println("Hi")}
        val greetingBuilder = applyGreeting(greet)
        println(sum (5,10))
        println(square(5))
        println(greetingBuilder)
        sayHiExplicit()
        greeting()


    }
}