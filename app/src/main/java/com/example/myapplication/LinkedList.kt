package com.example.myapplication

import java.util.LinkedList

// i -> insertion at index M EX = i 5 8 -> insert 8 at index 5
// r -> deletion at the front if the list is empty nothing happen to the list /////
// f -> insertion at the front Ex f 7 -> add 7 at the front ////
// q -> stop the program and exit


// what is an infix fun?


class LinkedList {
//    fun main() {
//        val listResponse: LinkedList<String> = LinkedList()
//
//        val input = readLine().toString().toList()
//
//        if (input.first().equals('q')) {
//
//        }
//        while (input.first().equals('q')) {
//
//
//        }
//    }
//
//    fun codeHere(input: String): String {
//
//    }

    fun main(){
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3
        node3.next = Node(value = "Finish")
        println("LinkedList $node1")
    }
}


data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

