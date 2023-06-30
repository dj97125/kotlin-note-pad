package com.example.myapplication.objects

class FlippingTheMatrix {
    val array = arrayOf(
        arrayOf(112, 42, 83, 119),
        arrayOf(56, 125, 56, 49),
        arrayOf(15, 78, 101, 43),
        arrayOf(62, 98, 114, 108)
    )

    fun main(){
        val new = array.flatten().sorted().reversed().slice(0..3)
        println("mutable ${new.sum()}")


    }
}