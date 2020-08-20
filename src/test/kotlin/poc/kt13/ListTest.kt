package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ListTest {

    @Test
    fun `listOf forEach`() {
        val list = listOf("omar", "barra")
        list.forEach{
            assertNotNull(it)
        }
    }

    @Test
    fun `listOf should be in mutable`() {
        val list = listOf("omar", 4)
        assertEquals("omar", list[0])
        assertEquals(4, list[1])
    }
}