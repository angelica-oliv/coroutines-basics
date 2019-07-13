package com.angelicao.coroutines.builders

import kotlinx.coroutines.*

fun CoroutineScope.getAsyncCoroutinesResult(): Deferred<String> =
    async {
        // suspend for 2 second
        delay(2000L)
        // this is the result
        "Coroutines!"
    }

fun main() {
    runBlocking {
        println("Hello")
        // wait for the result
        println(getAsyncCoroutinesResult().await())
    }
}