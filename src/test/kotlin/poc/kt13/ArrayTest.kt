package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ArrayTest {

    @Test
    fun arrayOf() {
        val array = arrayOf("omar", "barra")

        assertEquals(2, array.size)
        assertEquals("omar", array[0])
        assertEquals("barra", array[1])

        array[0] = "alberto"
        assertEquals("alberto", array[0])
    }
}