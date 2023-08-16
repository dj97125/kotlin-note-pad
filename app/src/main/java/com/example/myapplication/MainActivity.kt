package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.collections.CountingValleysHackerRank
import com.example.myapplication.collections.DropTake
import com.example.myapplication.collections.FoldReduce
import com.example.myapplication.collections.GrupBy
import com.example.myapplication.collections.PelotonoCodeChallenge
import com.example.myapplication.collections.RetainRemove
import com.example.myapplication.data_structure.LinkedList
import com.example.myapplication.data_structure.makeBeverageTree
import com.example.myapplication.data_structure.validParenthesis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LinkedList<Int>().mainLinkedList()
        "()()".validParenthesis().also { println("StackExample $it") }

        getConsecutiveNumbers(
            arrayOf(
                1,
                2,
                2,
                2,
                3,
                4
            ).toMutableList()
        ).also { println("getConsecutive Numbers $it") }

        makeBeverageTree().forEachDepthFirst {
            println(it.value)
        }

//        FoldReduce().giveMeFold()
//        DropTake().giveMeDropTake()
//        RetainRemove().giveMeRetainRemove()
//        CountingValleysHackerRank().giveMeValleys().also { println("CountingValleys $it") }
//        PelotonoCodeChallenge().isMoneyEnough()
//        FoldReduce().giveMeFold()
        Lambdas().main()




    }


    fun getConsecutiveNumbers(srcList: List<Int>): List<List<Int>> {
        return srcList.fold(mutableListOf<MutableList<Int>>()) { acc, i ->
            if (acc.isEmpty() || acc.last().last() != i - 1) {
                acc.add(mutableListOf(i))
            } else acc.last().add(i)
            acc
        }
    }


}

