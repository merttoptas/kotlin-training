package com.merttoptas.kotlin_training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.merttoptas.kotlin_training.collections.array.Arrays
import com.merttoptas.kotlin_training.collections.list.Lists
import com.merttoptas.kotlin_training.collections.maps.Maps
import com.merttoptas.kotlin_training.collections.operations.Operations
import com.merttoptas.kotlin_training.math_problems.Problems

class MainActivity : AppCompatActivity() {
    var array: Arrays = Arrays()
    var lists: Lists = Lists()
    var maps: Maps = Maps()
    var operations : Operations = Operations()
    var problems : Problems = Problems()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        array.main()
        lists.main()
        maps.main()
        operations.main()
        problems.calculateY()
        Log.d("deneme1", problems.calculateP().toString())
       // problems.calculateY()
    }
}