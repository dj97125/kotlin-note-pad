package com.example.myapplication.hackerrank


fun main(){
    val time = "12:45:54PM"
    militaryTimeConverter(time).also { println(it) }
}
fun militaryTimeConverter(s: String): String {
    val hour = s.substring(0, 2)
    val minutes = s.substring(3, 5)
    val seconds = s.substring(6, 8)
    val pmOrAm = s.substring(8)

    val militaryHour = if (pmOrAm == "PM") {
        if (hour != "12") {
            (hour.toInt() + 12)
        } else {
            "12"
        }
    } else {
        if (hour == "12") {
            "00"
        } else {
            hour
        }
    }

    return "$militaryHour:$minutes:$seconds"
}
