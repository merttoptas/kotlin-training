package com.merttoptas.kotlin_training.math_problems

import android.util.Log
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

class Problems {
    var u = 14.0
    var v = 105.0
    /*
    Math formule
    a + b = (a+ sqr(a'2-b)/2) + (a-sqr(a'2-b)/2)
     */

    fun calculateP(): Pair<Double, Double> {
        val diffSqrt = sqrt(u.pow(2.0) - v)
        val x = (u + diffSqrt) / 2
        val y = (u - diffSqrt) / 2

        return Pair(x, y)
    }

    fun calculateY(): Double {
        var p = sqrt(u + sqrt(v))
        val x = calculateP().first
        val y = calculateP().second

        val isIntegerX = x == x.roundToInt().toDouble() && x > 0
        val isIntegerY = y == y.roundToInt().toDouble() && y > 0
        val isEqual = p == (sqrt(x) + sqrt(y))

        if ((!isIntegerX && !isIntegerY) || !isEqual) {
            u -= 1.0
            v -= 3.0
            p = calculateY()
        }
        return p
    }
}