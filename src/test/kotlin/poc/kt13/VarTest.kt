package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class VarTest {

    @Test
    fun varWhenUseWithString() {
        var string = "this is a variable"
        assertEquals("this is a variable", string)

        string = "this variable has other value"
        assertEquals("this variable has other value", string)
    }

    @Test
    fun varWhenUseWithInteger() {
        var integer = 1991
        assertEquals(1991, integer)

        integer = 2020
        assertEquals(2020, integer)
    }

    /**
     * If I try to set other type, it is compile error. So it is impossible
     */
    @Test
    fun varWhenTryToSetOtherType() {
        var string = "this is a variable"
        assertEquals("this is a variable", string)

        string = 3.toString()
        assertEquals("3", string)
    }
}