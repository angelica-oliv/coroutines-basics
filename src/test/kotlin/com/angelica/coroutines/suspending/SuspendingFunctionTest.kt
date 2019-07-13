package com.angelica.coroutines.suspending

import com.angelicao.coroutines.suspending.doSomethingUsefulOne
import com.angelicao.coroutines.suspending.doSomethingUsefulTwo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Test

@ExperimentalCoroutinesApi
class SuspendingFunctionTest {

    @Test
    fun checkValueReturnedBy_doSomethingUsefulOne() = runBlockingTest {
        val valueUseful = doSomethingUsefulOne()
        assertEquals(13, valueUseful)
    }

    @Test
    fun checkValueReturnedBy_doSomethingUsefulTwo() = runBlockingTest {
        val valueUseful = doSomethingUsefulTwo()
        assertEquals(29, valueUseful)
    }
}