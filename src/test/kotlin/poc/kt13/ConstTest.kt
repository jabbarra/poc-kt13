package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals


const val CONST_VAL = "myconst"

class ConstTest {

    /**
     * Const is not applicable a local variable.
     * Const is assigned in compile time.
     */
    @Test
    fun const() {
        assertEquals("myconst", CONST_VAL)
    }

}