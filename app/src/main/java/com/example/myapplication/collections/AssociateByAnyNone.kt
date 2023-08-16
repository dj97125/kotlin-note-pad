package com.example.myapplication.collections

import com.example.myapplication.utils.fruitsList
import com.example.myapplication.utils.isEven2

class AssociateByAnyNone {

    fun giveMeAssociateByAnyNone(){

        fruitsList.associateBy { it.type }.also { println("asociate by $it") }


        fruitsList.any { it.type.toInt().isEven2() }.also { println("is there any even = $it") }
        fruitsList.none { it.type.toInt().isEven2() }.also { println("is there not even? = $it") }
        fruitsList.all { it.type.toInt().isEven2() }
            .also { println("is there all even = $it") }/// gives an true just if all the elements are even
    }
}