package com.example.myapplication.collections


private val lock = Any()

class SyncronizedEx() {
    fun increment() {
        var number = 0
        synchronized(lock) {
            repeat(20) {
                number = number.inc()
                println("$number + ${Thread.currentThread().id}")

            }
        }
    }


}


