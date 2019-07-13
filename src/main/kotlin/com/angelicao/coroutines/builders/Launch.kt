package com.angelicao.coroutines.builders

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    GlobalScope.launch { // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }

    println("Hello,") // main thread continues here immediately

    runBlocking {
        delay(2000L)  // ... 2 seconds to keep JVM alive
    }
}