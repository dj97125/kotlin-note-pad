package com.example.myapplication.collections

import com.example.myapplication.utils.giveMeMilitaryTime

class MilitaryTimeConverter {

    fun convertToMilitaryTime(time: String) {
        val value = time.takeLast(2)
        println("ToMilitaryTime = ${time.removeRange(8, 10).giveMeMilitaryTime(value)}")
    }


}