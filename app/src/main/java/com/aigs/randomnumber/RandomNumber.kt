package com.aigs.randomnumber
import kotlin.random.Random

class RandomNumber {
    fun getRandomNumber(): String {
        return Random.nextInt(0, 1000).toString()
    }
}