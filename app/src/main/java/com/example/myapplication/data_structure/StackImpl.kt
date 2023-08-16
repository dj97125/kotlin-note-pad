package com.example.myapplication.data_structure

interface Stack<T : Any> {
    fun pop(): T?
    fun push(element: T)
    fun peek(): T?
    val count: Int

    val isEmpty: Boolean
        get() = count == 0

}

class StackImpl<T : Any> : Stack<T> {
    private var storage = arrayListOf<T>()
    override val count: Int
        get() = storage.size

    override fun peek(  ): T? = storage.lastOrNull()

    override fun pop(): T? = storage.removeLastOrNull()

    override fun push(element: T) {
        storage.add(element)
    }

}

fun String.validParenthesis(): Boolean {
    val stack = StackImpl<Char>()

    this.forEach {
        when (it) {
            '(' -> stack.push(it)
            ')' -> if (stack.isEmpty) return false else stack.pop()
        }
    }
    return stack.isEmpty
}


data class Person(val isOpen: Boolean, val isChange: Boolean, val change: Int)