package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.collections.SyncronizedEx
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        getConsecutiveNumbers(
//            arrayOf(
//                1,
//                2,
//                2,
//                2,
//                3,
//                4
//            ).toMutableList()
//        ).also { println("getConsecutive Numbers $it") }
        GlobalScope.launch {
            withContext(Dispatchers.Default){
                SyncronizedEx().increment()
            }
        }
        GlobalScope.launch {
            withContext(Dispatchers.IO){
                SyncronizedEx().increment()
            }
        }
        GlobalScope.launch {
            withContext(Dispatchers.Default){
                SyncronizedEx().increment()
            }
        }



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

