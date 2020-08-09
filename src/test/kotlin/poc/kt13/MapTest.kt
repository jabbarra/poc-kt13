package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class MapTest {

    @Test
    fun mutableMapOf() {
        val map = mutableMapOf<String, Int>()
        map["omar"] = 3
        map["barra"] = 4

        assertEquals(2, map.size)
        assertEquals(3, map["omar"])
        assertEquals(4, map["barra"])

        map["omar"] = 5
        assertEquals(5, map["omar"])

        map.remove("omar")
        assertNull(map["omar"])
    }

    @Test
    fun mapOfForEach() {
        val map = mapOf("omar" to 3, "barra" to 2)
        map.forEach{
            assertNotNull(it.value)
        }
    }

    @Test
    fun mutableMapOfGetAndPutWhenDoNotUseOperatorOverloading() {
        val map = mutableMapOf<String, Int>()
        map.put("barra", 2)
        assertEquals(2, map.get("barra"))
    }

    @Test
    fun mapOfShouldBeInMutable() {
        val map = mapOf("omar" to 3, "barra" to 2)
        assertEquals(3, map["omar"])
        assertEquals(4, map["barra"])
    }
}