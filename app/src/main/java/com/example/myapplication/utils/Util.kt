package com.example.myapplication.utils


val fruitsList = mutableListOf(
    Fruits("2.png", false),
    Fruits("1.png", true),
    Fruits("3", true),
    Fruits("5", true),
    Fruits("6.png", true),
    Fruits("6", true),
    Fruits("7", true),
    Fruits("8.png", false),
    Fruits("8", false),
    Fruits("8.png", false),
).distinctBy { it.type }.sortedBy { it.type }

val mix = mutableListOf(
    Fruits("2.png", false),
    Fruits("1.png", true),
    Fruits("3", true),
    Fruits("5", true),
    Fruits("6.png", true),
    Fruits("6", true),
    Fruits("7", true),
    Fruits("8.png", false),
    Fruits("8", false),
    Fruits("8.png", false),
    Response(true, 30),
    Response(false, 50),
)


val comparisonSortingArr = arrayOf(
    63,
    25,
    73,
    1,
    98,
    73,
    56,
    84,
    86,
    57,
    16,
    83,
    8,
    25,
    81,
    56,
    9,
    53,
    98,
    67,
    99,
    12,
    83,
    89,
    80,
    91,
    39,
    86,
    76,
    85,
    74,
    39,
    25,
    90,
    59,
    10,
    94,
    32,
    44,
    3,
    89,
    30,
    27,
    79,
    46,
    96,
    27,
    32,
    18,
    21,
    92,
    69,
    81,
    40,
    40,
    34,
    68,
    78,
    24,
    87,
    42,
    69,
    23,
    41,
    78,
    22,
    6,
    90,
    99,
    89,
    50,
    30,
    20,
    1,
    43,
    3,
    70,
    95,
    33,
    46,
    44,
    9,
    69,
    48,
    33,
    60,
    65,
    16,
    82,
    67,
    61,
    32,
    21,
    79,
    75,
    75,
    13,
    87,
    70,
    33,
)

val elemets = listOf(
    Response(true, 30), Response(true, 5), Response(false, 35), Response(true, 30)
)
val elemets2 = listOf(
    Response(false, 30), Response(true, 5), Response(false, 35), Response(true, 30)
)

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)


val bananasList = mutableListOf(
    "BANANAS", "bananas", "Bananas", "BaNanas", "MANZANA", "manzana"
)

val listNumbers = listOf<Int>(0, 1, 1, 1, 2, 2, 3)

val flipingTheMatrixArray = arrayOf(
    arrayOf(112, 42, 83, 119),
    arrayOf(56, 125, 56, 49),
    arrayOf(15, 78, 101, 43),
    arrayOf(62, 98, 114, 108)
)

val arrayDiagonalDiference = arrayOf(arrayOf(11, 2, 4) , arrayOf(4, 5, 6) , arrayOf(10, 8, -12))
