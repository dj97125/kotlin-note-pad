package com.example.myapplication.hackerrank

const val DEUCE_GAME_STATE = "DEUCE"
const val ADVANTAGE_GAME_STATE = "ADVANTAGE"

fun computeGameState(nameP1: String, nameP2: String, wins: Array<String>): String {
    val scoreP1 = wins.count { it == nameP1 }
    val scoreP2 = wins.count { it == nameP2 }


    return when {
        (scoreP1 >= 4 && scoreP1 >= scoreP2 + 2) -> "$nameP1 WINS"
        (scoreP2 >= 4 && scoreP2 >= scoreP1 + 2) -> "$nameP2 WINS"
        (scoreP1 >= 3 && scoreP2 >= 3) -> {
            return when {
                (scoreP1 == scoreP2) -> DEUCE_GAME_STATE
                (scoreP1 > scoreP2) -> "$nameP1 $ADVANTAGE_GAME_STATE"
                else -> "$nameP2 $ADVANTAGE_GAME_STATE"
            }

        }

        (scoreP1 == 1 && scoreP2 == 1) -> "15a"
        (scoreP1 == 2 && scoreP2 == 2) -> "30a"
        (scoreP1 == 3 && scoreP2 == 0) -> "$nameP1 40 - $nameP2 0"
        (scoreP1 == 0 && scoreP2 == 3) -> "$nameP1 0 - $nameP2 40"
        (scoreP1 == 1 && scoreP2 == 0) -> "$nameP1 15 - $nameP2 0"
        (scoreP1 == 0 && scoreP2 == 1) -> "$nameP1 0 - $nameP2 15"
        (scoreP1 == 2 && scoreP2 == 0) -> "$nameP1 30 - $nameP2 0"
        (scoreP1 == 0 && scoreP2 == 2) -> "$nameP1 0 - $nameP2 30"
        (scoreP1 == 3 && scoreP2 == 1) -> "$nameP1 40 - $nameP2 15"
        (scoreP1 == 1 && scoreP2 == 3) -> "$nameP1 15 - $nameP2 40"
        (scoreP1 == 3 && scoreP2 == 2) -> "$nameP1 40 - $nameP2 30"
        (scoreP1 == 2 && scoreP2 == 3) -> "$nameP1 30 - $nameP2 40"


        else -> "$nameP1 $scoreP1 - $nameP2 $scoreP2"
    }

}





fun main() {
    val wins = arrayOf(
        "Player 1",
        "Player 1",
        "Player 1",
        "Player 2",
        "Player 2",
        "Player 2",
        "Player 1",

    )
    computeGameState("Player 1", "Player 2", wins).also { println(it) }
}