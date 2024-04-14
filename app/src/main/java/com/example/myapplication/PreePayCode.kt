package com.example.myapplication

fun MatrixPath(strArr: Array<String>): String {
    val rows = strArr.size
    val cols = strArr[0].length

    fun isValid(i: Int, j: Int): Boolean {
        return i in 0 until rows && j in 0 until cols
    }

    fun hasPath(matrix: Array<CharArray>, i: Int, j: Int): Boolean {
        if (i == rows - 1 && j == cols - 1) {
            return true
        }

        matrix[i][j] = '0'

        val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

        for ((di, dj) in directions) {
            val ni = i + di
            val nj = j + dj

            if (isValid(ni, nj) && matrix[ni][nj] == '1') {
                if (hasPath(matrix, ni, nj)) {
                    return true
                }
            }
        }

        return false
    }

    val matrix = strArr.map { it.toCharArray() }.toTypedArray()

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (matrix[i][j] == '0') {
                matrix[i][j] = '1'
                if (hasPath(matrix, 0, 0)) {
                    return "1"
                }
                matrix[i][j] = '0'
            }
        }
    }

    return "not possible"
}


fun main() {
//    val response = arrayOf("1000001", "1001111", "1010101")
    val response = arrayOf("10000", "11011", "10101", "11001")
    println(MatrixPath(response))
}