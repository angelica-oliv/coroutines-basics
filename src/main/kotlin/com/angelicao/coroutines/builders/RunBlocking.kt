package com.angelicao.coroutines.builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Hello,")

    // block the main thread while waiting for the coroutine to finish its execution
    runBlocking {
        // now we are inside a coroutine
        delay(2000L) // suspends the current coroutine for 2 seconds
    }

    // will be executed after 2 seconds
    println("World!")
}