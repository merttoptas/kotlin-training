package com.merttoptas.kotlin_training.collections.maps

import android.os.Build
import androidx.annotation.RequiresApi

class Maps() {
    fun main() {
        val httpHeaders = mapOf(
            "Authorization" to "your_api_key",
            "ContentType" to "application/json",
            "UsersLocale" to "Us"
         )

         val httpHeader = mutableMapOf(
            "Authorization" to "your_api_key",
            "ContentType" to "application/json",
            "UsersLocale" to "Us"
        )
        println(httpHeaders["ContentType"])
        httpHeader.put("Hello", "World")
        println(httpHeader)

        httpHeaders.forEach { (key, value) -> println("Value for key $key is $value") }

    }
}