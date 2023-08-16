package com.example.myapplication.collections

import com.example.myapplication.utils.flipingTheMatrixArray

class FlippingTheMatrix {

    fun main() {
        val new = flipingTheMatrixArray.flatten().sorted().reversed().slice(0..3)
        println("mutable ${new.sum()}")


    }
}