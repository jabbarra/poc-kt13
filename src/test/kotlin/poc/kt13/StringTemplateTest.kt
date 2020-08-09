package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class StringTemplateTest {

    @Test
    fun stringTemplate() {
        val version = 1.3
        val truly = true
        val kotlin = "this is the $truly kotlin $version"
        assertEquals("this is the true kotlin 1.3", kotlin)
    }
}