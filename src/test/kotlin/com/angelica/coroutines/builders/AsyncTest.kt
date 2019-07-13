package com.angelica.coroutines.builders

import com.angelicao.coroutines.builders.getAsyncCoroutinesResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Test

@ExperimentalCoroutinesApi
class AsyncTest {

    @Test
    fun checkValueReturnedBy_getDeferredCoroutinesResult() = runBlockingTest {
        val returnedValue = getAsyncCoroutinesResult().await()

        assertEquals("Coroutines!", returnedValue)
    }
}