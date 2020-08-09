package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals


class EnumPaymentTermTest {

    @Test
    fun showPretty() {
        assertEquals("1 client code", EnumPaymentTerm.TC.showPretty())
    }

    @Test
    fun getValue() {
        assertEquals(2, EnumPaymentTerm.TD.value)
    }

    /**
     * Kotlin does not check against all possible enumeration values
     */
    @Test
    fun enumAndWhen() {
        val myEnum = null
        val description = when(myEnum){
            EnumPaymentTerm.TC -> "credit card"
            else -> "not credit card"
        }
        assertEquals("not credit card", description)
    }
}