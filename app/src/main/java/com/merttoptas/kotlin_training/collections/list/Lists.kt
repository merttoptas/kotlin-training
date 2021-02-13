package com.merttoptas.kotlin_training.collections.list

class Lists {
    fun main() {
        val list = mutableListOf(2, 3, 5, 6, 7)
        list[2] = 100 // works now
        println(list[2]) // 100
        list.add(index = 3, element = 500)
        println(list[3]) // 500
        list.remove(7)
        println(list) // [2, 3, 100, 500, 6]
        list.removeAt(0)
        println(list) // [3, 100, 500, 6]

        val workers = setOf(
            Worker(id = 1, name = "Mert"),
            Worker(id = 2, name = "Philip"),
            Worker(id = 3, name = "Mert")
        )
        println(workers)
    }
}

data class Worker(val id: Int, val name: String)