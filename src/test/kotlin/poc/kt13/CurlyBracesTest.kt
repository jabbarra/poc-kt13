package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CurlyBracesTest {

    /**
     * Run Calls the specified function block and returns its result.
     * {} are always a lambda expression or a part of a syntax construct.
     */
    @Test
    fun `run should return completed name`() {
        val result = run {
            val firstName = "Omar"
            val secondName = "Barra"
            "$firstName $secondName"
        }
        assertEquals("Omar Barra", result)
    }

    @Test
    fun `no use run should return completed name`() {
        val result =  {
            val firstName = "Omar"
            val secondName = "Barra"
            "$firstName $secondName"
        }
        assertEquals("Omar Barra", result())
    }

}