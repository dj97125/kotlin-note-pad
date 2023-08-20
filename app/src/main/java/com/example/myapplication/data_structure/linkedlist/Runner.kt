package com.example.myapplication.data_structure.linkedlist

fun main() {
//    val list = Node(1, Node(2, Node(3, Node(4))))
//    println(list)
//    list.printInReverse()
//    insertExample()
//    popExample()
//    removeLastExample()
    removeAfterExample()

}

fun pushExample() {
    val list = LinkedList<Int>()

    list.push(3).push(8).push(10).push(16).push(19)
}

fun appendExample() {
    val list = LinkedList<Int>()

    list.append(3).append(8).append(10).append(16).append(19)
}

fun insertExample() {
    val list = LinkedList<Int>()
    list.push(3).push(8).push(10).push(16).push(19)
    println("Before inserting= $list")

    var middleNode = list.nodeAt(1)!!

    (0..3).forEach {
        middleNode = list.insert((-1).times(it), middleNode)
    }

    println("After inserting= $list")
}

fun popExample() {
    val list = LinkedList<Int>()

    list.push(3).push(2).push(1)

    println("Before popping list: $list")

    val poppedValue = list.pop()

    println("After popping list: $list")

    println("Popped value: $poppedValue")
}

fun removeLastExample() {
    val list = LinkedList<Int>()

    list.push(3).push(2).push(1)

    println("Before removing last node: $list")

    val removedValue = list.removeLast()

    println("After removing last node: $list")

    println("Removed value: $removedValue")
}

fun removeAfterExample() {
    val list = LinkedList<Int>()

    list.push(3).push(2).push(1)

    println("Before removing particular index: $list")

    val index = 1
    val node = list.nodeAt(index - 1)!!
    val removedValue = list.removeAfter(node)

    println("After removing at index $index: $list")
    println("Removed value: $removedValue≈")
}