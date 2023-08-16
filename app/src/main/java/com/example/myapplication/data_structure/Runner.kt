package com.example.myapplication.data_structure

fun makeBeverageTree(): TreeNodeImpl<String>{
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
    tree.add(tea)
    tree.add(coffe)
    tree.add(chocolate)
    tree.add(blackTea)
    tree.add(greenTea)
    tree.add(chaiTea)
    tree.add(soda)
    tree.add(milk)
    tree.add(gingerAle)
    tree.add(bitterLemon)

    return tree
}