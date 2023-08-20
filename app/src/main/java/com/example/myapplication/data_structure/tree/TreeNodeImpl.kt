package com.example.myapplication.data_structure.tree

import com.example.myapplication.data_structure.queue.QueueImpl

typealias Visitor<T> = (TreeNodeImpl<T>) -> Unit

class TreeNodeImpl<T>(val value: T) {

    private val children: MutableList<TreeNodeImpl<T>> = mutableListOf()

    fun add(child: TreeNodeImpl<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>){


        visit(this)

        children.forEach {
            it.forEachDepthFirst(visit)
        }
        println()
    }

    fun forEachLevelOrder(visit: Visitor<T>){
        println("--forEachLevelOrder--")

        visit(this)

        val queue = QueueImpl<TreeNodeImpl<T>>()

        children.forEach {
            queue.enqueue(it)
        }

        var node = queue.dequeue()

        while (node != null) {
            visit(node)
            node.children.forEach {
                queue.enqueue(it)
            }
            node = queue.dequeue()
        }
        println()
    }

    fun search(value: T): TreeNodeImpl<T>? {
        var result: TreeNodeImpl<T>? = null
        println("--Search--")

        forEachDepthFirst {
            if (it.value == value) {
                result = it
                println("Found Value ${it.value}")
            }
        }
        println()

        return result
    }
    fun printEachLevel(){
        println("--printEachLevel--")
        val queue = QueueImpl<TreeNodeImpl<T>>()

        var nodesLeftInCurrentLevel = 0

        queue.enqueue(this)

        while (queue.isEmpty.not()){
            nodesLeftInCurrentLevel = queue.count

            while (nodesLeftInCurrentLevel > 0){
                val node = queue.dequeue()

                node?.let {
                    println("${it.value}")

                    it.children.forEach { queue.enqueue(it) }

                    nodesLeftInCurrentLevel--
                } ?: break
            }
        }
    }
}