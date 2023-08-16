package com.example.myapplication.data_structure

typealias Visitor<T> = (TreeNodeImpl<T>) -> Unit

class TreeNodeImpl<T>(val value: T) {

    private val children: MutableList<TreeNodeImpl<T>> = mutableListOf()

    fun add(child: TreeNodeImpl<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>){
        visit(this)

        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>){
        visit(this)

        val queue = QueueImpl<TreeNodeImpl<T>>()

        children.forEach {
            queue.enqueue(it)
        }

        var node = queue.dequeue()

        while (node != null){
            visit(node)
            node.children.forEach {
                queue.enqueue(it)
            }
            node = queue.dequeue()
        }
    }
}