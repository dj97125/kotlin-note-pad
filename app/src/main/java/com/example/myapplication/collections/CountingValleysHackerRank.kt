package com.example.myapplication.collections


class CountingValleysHackerRank {

    fun giveMeValleys():Int {
        val record = "udDDuDUU"
        var valleyCounter = 0
        var altitude = 0

        record.uppercase().forEach {
            when (it) {
                'U' -> {
                    altitude++
                    if(altitude == 0) valleyCounter ++
                }
                else -> altitude --
            }
        }

        return valleyCounter
    }
}