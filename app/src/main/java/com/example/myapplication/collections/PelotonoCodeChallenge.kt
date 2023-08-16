package com.example.myapplication.collections


data class Response(
    val isOpen: Boolean,
    val change: Int
)

class PelotonoCodeChallenge {

    fun isMoneyEnough() {
        val ticketPrice = 80

        listOf(25, 25, -1, 25, 5, 5, 25, -1, 25, 25, 25, 25,25, 1, 25, 25, 25, 10, 4, 2).isEnough(
            ticketPrice
        ).also { println("isMooneyEnough? $it") }

    }

    fun List<Int>.isEnough(ticketPrice: Int): List<Response> {
        val mutableForReturn = mutableListOf<Response>()
        val mutableListForAcumulator = mutableListOf<Int>()

        this.forEach {
            when (it) {
                -1 -> {
                    mutableForReturn.add(Response(false, mutableListForAcumulator.sum()))
                    mutableListForAcumulator.clear()
                }

                1 -> {
                    mutableForReturn.add(
                        Response(
                            true,
                            100.plus(mutableListForAcumulator.sum()).minus(ticketPrice)
                        )
                    )
                    mutableListForAcumulator.clear()
                }

                else -> {
                    mutableListForAcumulator.add(it)
                }
            }
            if (mutableListForAcumulator.sum() >= ticketPrice) {
                mutableForReturn.add(
                    Response(
                        true,
                        mutableListForAcumulator.sum().minus(ticketPrice)
                    )
                )
                mutableListForAcumulator.clear()
            }

        }
        return mutableForReturn

    }
}