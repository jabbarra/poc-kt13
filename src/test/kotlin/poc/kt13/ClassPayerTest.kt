package poc.kt13

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue


class ClassPayerTest {

    @Test
    fun instanceObjectWhenPassAllParameter() {
        val instance = ClassPayer("omar", 29,
                arrayOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD))
        assertNotNull(instance.showCardName("der", 0))
        assertNotNull(instance.showCardName("der", 6))
        assertTrue { instance.isAdult }
    }

    @Test
    fun instanceObjectWhenNotPassAllParameter() {
        val instance = ClassPayer("omar", 10)
        assertNotNull(instance.showCardName("der", 0))
        assertNotNull(instance.showCardName("der", 6))
        assertFalse { instance.isAdult }
    }
}