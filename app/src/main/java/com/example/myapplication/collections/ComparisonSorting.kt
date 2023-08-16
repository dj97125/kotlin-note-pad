package com.example.myapplication.collections

import com.example.myapplication.utils.comparisonSortingArr

class ComparisonSorting {
    fun giveMesort() {
        (comparisonSortingArr.toMutableList() + (0..99).toMutableList()).sorted().groupingBy { it }.eachCount()
            .map { it.value.minus(1) }.also { println("giveMeSort $it") }
    }
}