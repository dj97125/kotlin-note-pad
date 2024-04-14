package com.example.myapplication.data_structure.stack

fun main() {
    "(()()".validParenthesis().also { println("StackExample $it") }
}

//fun String.validParenthesis(): Boolean {
//    val stack1 = mutableListOf<Char>()
//
//
//    this.forEach { ch ->
//        when (ch) {
//            '(' -> stack1.add(ch)
//            ')' -> {
////                val finder = ch.toString().find { it == ch }
//                if (stack1.isEmpty()) {
//                    return false
//                } else stack1.removeIf(){
//
//                }
//
//            }
//
//        }
//    }
//    return stack1.isEmpty()
//}
