package com.example.myapplication.data_structure



interface Queue<T>{
    val count: Int

    val isEmpty: Boolean
        get() = count == 0

    fun peek(): T?

    fun enqueue(element: T): Boolean

    fun dequeue(): T?

}
class QueueImpl<T>: Queue<T> {
    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun peek(): T? = storage.firstOrNull()

    override fun dequeue(): T? = if (isEmpty) null else storage.removeFirstOrNull()

    override fun enqueue(element: T): Boolean = storage.add(element)

}