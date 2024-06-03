package com.example.myapplication.hackerrank



fun main(){
    ZigZagSequence(args = arrayOf("1","2","3","4","5","6","7"))

}
fun ZigZagSequence(args: Array<String>) {
    val argsList = args.toMutableList()
    val lastElement = argsList.last()
    val chunkSize = (args.size - 1) / 2
    argsList[chunkSize] += lastElement

    println(argsList.toString())
}