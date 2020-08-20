package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class HighOrderFunctionTest {

    @Test
    fun inlineFunction() {
        val numbers = listOf(1, 2, 3, 5, 0)
        val filter = { x: Int -> x == 3 }
        val result = findFirst(numbers, filter)
        assertEquals(3, result)
    }

    @Test
    fun inlineFunctionShouldBeThrowException() {
        val numbers = listOf(1, 2, 5, 0)
        val filter = { x: Int -> x == 3 }
        assertFailsWith<Exception> { findFirst(numbers, filter) }
    }
}