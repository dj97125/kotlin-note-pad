package com.example.myapplication.data_structure.tree

fun makeBeverageTree(): TreeNodeImpl<String> {
    val tree = TreeNodeImpl("Beverages")
    val hot = TreeNodeImpl("hot")
    val cold = TreeNodeImpl("cold")
    val tea = TreeNodeImpl("tea")
    val coffe = TreeNodeImpl("coffe")
    val chocolate = TreeNodeImpl("chocolate")
    val blackTea = TreeNodeImpl("blackTea")
    val greenTea = TreeNodeImpl("greenTea")
    val chaiTea = TreeNodeImpl("chaiTea")
    val soda = TreeNodeImpl("soda")
    val milk = TreeNodeImpl("milk")
    val gingerAle = TreeNodeImpl("gingerAle")
    val bitterLemon = TreeNodeImpl("bitterLemon")


    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffe)
    hot.add(chocolate)

    cold.add(soda)
    cold.add(milk)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)

    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
}

fun main(){
    val tree = makeBeverageTree()

    println("--forEachDepthFirst--")
    tree.forEachDepthFirst {

        println(it.value)
    }


    tree.forEachLevelOrder {

        println(it.value)
    }


    tree.search("coffe")

    tree.printEachLevel()
}