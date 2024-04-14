package com.example.myapplication.hackerrank



    fun main() {
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

    }