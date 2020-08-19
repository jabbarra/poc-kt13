package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class ValTest {

    /**
     * Val is as constant in runtime
     * If I try to set other value, it is compile error. So it is impossible.
     */
    @Test
    fun valWhenUseWithString() {
        val string = "this is a variable"
        assertEquals("this is a variable", string)
    }

    /**
     * Val is as constant in runtime
     * If I try to set other value, it is compile error. So it is impossible.
     */
    @Test
    fun valWhenUseWithInteger() {
        val integer = 1991
        assertEquals(1991, integer)
    }

    /**
     * Val is as constant in runtime
     * Val can be assigned to a function.
     */
    @Test
    fun valWhenUseWithFunction() {
        val someValue = getSomeValue()
        assertEquals("somevalue", someValue)
    }

    private fun getSomeValue(): String {
        return "somevalue"
    }
}