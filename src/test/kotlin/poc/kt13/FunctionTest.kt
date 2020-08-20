package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class FunctionTest {
    @Test
    fun extensionFunction() {
        val result = "this is a \t TEST".replaceMultipleWhiteSpace()
        assertEquals("this is a TEST", result)
    }

    @Test
    fun notInfixFunction() {
        val result = "this is a ".myConcat("TEST")
        assertEquals("this is a TEST", result)
    }

    @Test
    fun infixFunction() {
        val result = "this is a " myConcatInfix  "TEST"
        assertEquals("this is a TEST", result)
    }

    @Test
    fun infixOperatorFunction() {
        val instance = ClassPayer("omar", 10,
                arrayOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD))
        val other = ClassPayer("barra", 10,
                arrayOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD))
        val result = instance + other
        assertEquals("omarbarra", result.name)
        assertEquals(20, result.age)
    }
}
