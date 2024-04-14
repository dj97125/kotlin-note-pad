package com.example.myapplication.data_structure.linkedlist

/**
 *                          1
 *                  2               3
 *              1   4   5       2   1   6
 *                            1
 *
 *
 */
data class TreeNode(
    val value: Int,
    val children: MutableList<TreeNode> = mutableListOf()
)

fun main() {

    val leftChild = TreeNode(
        value = 2,
        children = mutableListOf(
            TreeNode(1),
            TreeNode(4),
            TreeNode(5)
        )
    )

    val rightChild = TreeNode(
        value = 3,
        children = mutableListOf(
            TreeNode(2, children = mutableListOf(TreeNode(1))),
            TreeNode(1),
            TreeNode(6)
        )
    )

    val root = TreeNode(1, mutableListOf(leftChild, rightChild))

    val findAllOnesTest = root.findOcurrencesOf(1)
    val findNonExistentTest = root.findOcurrencesOf(43)

    val answerOne = 4
    val anserTwo = 0

    if (findAllOnesTest == answerOne) println("Success") else println(findAllOnesTest)
    if (findNonExistentTest == answerOne) println("Success") else println(findAllOnesTest)
}

/**
 * if no ocurrences return 0
 *
 * 1.- Starting with the root node, and for all nodes:
 *      - let value be the searched value
 *      - let current be the node within the current function call
 *      - if current has no children, then return 1 only if it equals the searched value, otherwise 0
 *      - if current has children, add sum of all calls to findOcurrencesOf for all children
 *      as well as if it equals the searched value; in wich case add 1
 */

fun TreeNode.findOcurrencesOf(value: Int): Int {
    //base case

    val hasOcurrence = if (value == this.value) 1 else 0
    return if (this.children.isEmpty()) {
        hasOcurrence
    } else {
        var ocurrenceCounter = 0

        this.children.forEach {
            ocurrenceCounter += it.findOcurrencesOf(value)
        }
        hasOcurrence + ocurrenceCounter
    }

}