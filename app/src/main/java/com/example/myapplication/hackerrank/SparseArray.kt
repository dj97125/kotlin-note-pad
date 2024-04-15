package com.example.myapplication.hackerrank


fun main(){
    val strings = arrayOf("ab","ab","abc")
    val queries = arrayOf("ab","abc","bc")

    matchingStrings(strings, queries)
}
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val mutableCollectionSize = mutableListOf<Int>()
    queries.forEach{
        val finding = strings.filter { sec -> sec == it }
        mutableCollectionSize.add(finding.size)
    }
    return mutableCollectionSize.toTypedArray()

}