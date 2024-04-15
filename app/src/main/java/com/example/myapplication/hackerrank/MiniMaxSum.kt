package com.example.myapplication.hackerrank


fun main(){
    val arr2 = arrayOf(793810624,895642170,685903712,623789054,468592370)
    val arr = arrayOf(1,3,5,7,9)
    miniMaxSum(arr2)
}
fun miniMaxSum(arr: Array<Int>) {
    val valuesToLongAndSorted = arr.map { it.toLong() }.sorted()
    val minSum = valuesToLongAndSorted.take(4).sum()
    val maxSum = valuesToLongAndSorted.takeLast(4).sum()
    println("$minSum $maxSum")

}