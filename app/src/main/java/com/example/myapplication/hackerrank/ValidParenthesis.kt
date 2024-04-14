package com.example.myapplication.hackerrank

import java.util.Stack

/// if its valid return 1 else 0

fun main() {
    "((){)}[]".validParenthesis().also { println(it) }
}

fun String.validParenthesis(): Int {
    val stack1 = Stack<Char>()
    val stack2 = Stack<Char>()
    val stack3 = Stack<Char>()

    this.forEach { ch ->
        when (ch) {
            '(' -> {
                if(stack2.isEmpty() && stack3.isEmpty()) {
                    stack1.push(ch)
                } else {
                    return 0
                }
            }
            ')' ->  {
                if(stack1.isNotEmpty()){
                    stack1.pop()
                } else {
                    return 0
                }

            }

            '{' ->  {
                if(stack1.isEmpty() && stack3.isEmpty()){
                    stack2.push(ch)
                } else {
                    return 0
                }

            }
            '}' ->  {
                if(stack2.isNotEmpty()){
                    stack2.pop()
                } else {
                    return 0
                }

            }


            '[' -> {
                if(stack2.isEmpty() && stack1.isEmpty()){
                    stack3.push(ch)
                } else {
                    return 0
                }

            }
            ']' -> {
                if(stack3.isNotEmpty()){
                    stack3.pop()
                } else {
                    return 0
                }

            }


        }
    }

    return if (stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()) 1 else 0
}