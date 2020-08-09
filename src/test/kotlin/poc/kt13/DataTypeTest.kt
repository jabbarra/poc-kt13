package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class DataTypeTest {

    /**
     * Explicitly type is redundant
     */
    @Test
    fun stringTest() {
        val string: String = "string"
        assertEquals("string", string)
    }

    /**
     * Explicitly type is redundant
     */
    @Test
    fun intTest() {
        val int: Int = 999999999
        assertEquals(999999999, int)
    }

    /**
     * Explicitly type is not redundant
     */
    @Test
    fun longTest() {
        val long: Long = 999999999999999999
        assertEquals(999999999999999999, long)
    }

    /**
     * Explicitly type is not redundant
     */
    @Test
    fun shortTest() {
        val short: Short = 9999
        assertEquals(9999, short)
    }

    /**
     * Explicitly type is not redundant
     */
    @Test
    fun byteTest() {
        val byte: Byte = 99
        assertEquals(99, byte)
    }


    /**
     * Explicitly type is redundant
     */
    @Test
    fun floatTest() {
        val float: Float = 4.04F
        assertEquals(4.04F, float)
    }

    /**
     * Explicitly type is redundant
     */
    @Test
    fun doubleTest() {
        val double: Double = 4.04
        assertEquals(4.04, double)
    }

    @Test
    fun booleanTest() {
        var boolean: Boolean = true
        assertEquals(true, boolean)

        boolean = false
        assertEquals(false, boolean)
    }

}