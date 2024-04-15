package com.example.myapplication.hackerrank

fun main(){
    val n = 2147483647L
    flippingBits(n).also { println(it) }
}

fun flippingBits(n: Long): Long {
    val to32Bits = n.toString(2).padStart(32, '0')
    to32Bits.map { if (it == '0') '1' else '0' }.joinToString("").also { return it.toLong(2) }
}