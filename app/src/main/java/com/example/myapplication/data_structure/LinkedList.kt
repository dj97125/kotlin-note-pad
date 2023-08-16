package com.example.myapplication.data_structure

// i -> insertion at index M EX = i 5 8 -> insert 8 at index 5
// r -> deletion at the front if the list is empty nothing happen to the list /////
// f -> insertion at the front Ex f 7 -> add 7 at the front ////
// q -> stop the program and exit


// what is an infix fun?

class LinkedList<T> {

//class LinkedList {
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

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean = size == 0
    override fun toString(): String = if (isEmpty()) "Empty List" else head.toString()

    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) tail = head
        size = +1
        return this
    }

    fun append(value: T): LinkedList<T> {
        if (isEmpty()){
            push(value)
            return this
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size =+ 1
        return this

    }


//    fun mainLinkedList(){
//        val node1 = Node(value = 1)
//        val node2 = Node(value = 2)
//        val node3 = Node(value = 3)
//
//        node1.next = node2
//        node2.next = node3
//
//        println("LinkedList $node1")
//    }

    fun mainLinkedList() {
        val list = LinkedList<Int>()
        list.append(1).append(2).append(3)
//        list.push(2)
//        list.push(3)

        println("LinkedList $list")
    }
}


data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return next?.let {
            "$value -> ${next.toString()}"
        } ?: run { "$value" }
//        return if (next != null) {
//            "value -> ${next.toString()}"
//        } else {
//            "$value"
//        }
    }
}

