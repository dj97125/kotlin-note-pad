package com.example.myapplication.collections


interface Animal {
    fun makeSound()
}

fun main(){
    val animal = Dog(Cat())
    animal.makeSound()
}

class Dog(private val animal: Animal): Animal by animal  {
    override fun makeSound() {
        println("Bow,Bow")
    }
}

class Cat:Animal{
    override fun makeSound() {
        println("Meeow")
    }
}

