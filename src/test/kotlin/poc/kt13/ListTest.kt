package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ListTest {

    @Test
    fun arrayListOf() {
        val list = arrayListOf("omar")
        list.add("barra")

        assertEquals(2, list.size)
        assertEquals("omar", list[0])
        assertEquals("barra", list[1])

        list[0] = "alberto"
        assertEquals("alberto", list[0])


        list.removeAt(0)
        assertEquals("barra", list[0])
    }

    @Test
    fun listOfForEach() {
        val list = listOf("omar", "barra")
        list.forEach{
            assertNotNull(it)
        }
    }

    @Test
    fun arrayListGetWhenDoNotUseOperatorOverloading() {
        val list = arrayListOf("omar")
        list.add("barra")
        assertEquals("barra", list.get(2))
    }

    @Test
    fun listOfShouldBeInMutable() {
        val list = listOf("omar", 4)
        assertEquals("omar", list[0])
        assertEquals(4, list[1])
    }
}