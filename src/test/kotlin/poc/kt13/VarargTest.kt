package poc.kt13

import kotlin.test.*

class VarargTest {

    @Test
    fun varargWhenMaxIsMax() {
        assertTrue(isMax(3, 1,2,3))
    }

    @Test
    fun varargWhenMaxIsNotMax() {
        assertFalse(isMax(3))
    }

    fun isMax(possibleMax: Int, vararg remaining: Int): Boolean {
        val max = remaining.asList().max()
        return max?.let { possibleMax >= it }
                ?: run{false}
    }
}