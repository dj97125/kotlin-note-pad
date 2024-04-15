package com.example.myapplication.hackerrank


fun main(){
    val arr = arrayOf(-4,3,-9,0,4,1)
    plusMinus(arr)
}
fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0
    var negative = 0
    var zeros = 0

    arr.forEach{
        when {
            it > 0 -> positive++
            it < 0 -> negative++
            else -> zeros++
        }
    }

    println(positive.toFloat()/arr.size)
    println(negative.toFloat()/arr.size)
    println(zeros.toFloat()/arr.size)

}