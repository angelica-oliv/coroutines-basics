package com.angelicao.coroutines.builders

import kotlinx.coroutines.*

fun main() {
    val deferredResult: Deferred<String> = GlobalScope.async {
        // suspend for 1 second
        delay(1000L)
        // this is the result
        "World!"
    }

    runBlocking {
        println("Hello")
        // wait for the result
        println(deferredResult.await())
    }
}