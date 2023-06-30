package com.example.myapplication

class MilitaryTimeConverter {

    fun convertToMilitaryTime(time: String) {
        val value = time.takeLast(2)
        println("ToMilitaryTime = ${time.removeRange(8, 10).giveMeMilitaryTime(value)}")
    }

    private fun String.giveMeMilitaryTime(value: String): String {

        var modifiedString = this

        if (modifiedString.take(2) == "12") {
            modifiedString = modifiedString.replaceRange(0..1, "00")
        }

        return if (value.equals("AM")) {
            modifiedString
        } else {
            val newMutable = modifiedString.split(":").toMutableList()

            newMutable[0] = (newMutable.first().toInt() + 12).toString()
            newMutable.joinToString(separator = ":")

        }
    }
}