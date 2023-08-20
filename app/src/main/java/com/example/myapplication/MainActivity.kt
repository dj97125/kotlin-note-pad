package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.collections.Anagram
import com.example.myapplication.data_structure.stack.validParenthesis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



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



//        FoldReduce().giveMeFold()
//        DropTake().giveMeDropTake()
//        RetainRemove().giveMeRetainRemove()
//        CountingValleysHackerRank().giveMeValleys().also { println("CountingValleys $it") }
//        PelotonoCodeChallenge().isMoneyEnough()
//        FoldReduce().giveMeFold()
//        Lambdas().main()

            Anagram().main(arrayOf("ate","eat","tae","bind","bound","bndou"))



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

