package com.example.myapplication.hackerrank


fun main(){
    countingSort(arr = arrayOf(0,2,3,4,56,7,89,90))
}

fun countingSort(arr: Array<Int>): Array<Int> {
    // Initialize an array to store the frequency of each element
    val frequency = Array(100) {
        0
    }

    // Count the occurrences of each element in the input array
    arr.forEach {
        frequency[it]++
    }

    // Convert the frequency array to a single list of occurrences
    return frequency.toList().toTypedArray()
}