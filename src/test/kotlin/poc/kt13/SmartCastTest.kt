package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class SmartCastTest {

    @Test
    fun castToString() {
        val myObject: Any = "this is a string"

        if( myObject is String)
            assertEquals(16, myObject.length)
    }

    @Test
    fun castToInt() {
        val myObject: Any = 16

        if( myObject is Int)
            assertEquals(16, myObject)
    }

    @Test
    fun castWithWhen() {
        val myObject: Any = 4.04
        val result =  when(myObject) {
            is Int -> myObject
            is Double -> myObject
            is String -> myObject.length
            else -> null
        }

        assertEquals(4.04, result)
    }
}