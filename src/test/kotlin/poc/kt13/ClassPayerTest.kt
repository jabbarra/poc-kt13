package poc.kt13

import kotlin.test.Test
import kotlin.test.assertNotNull


class ClassPayerTest {

    @Test
    fun instanceObjectWhenPassAllParameter() {
        val instance = ClassPayer("omar", 29,
                arrayOf(ClassPayer.PaymentTerm.TC,
                ClassPayer.PaymentTerm.TD))
        assertNotNull(instance.showCardName("der", 0))
        assertNotNull(instance.showCardName("der", 6))
    }

    @Test
    fun instanceObjectWhenNotPassAllParameter() {
        val instance = ClassPayer("omar", 29)
        assertNotNull(instance.showCardName("der", 0))
        assertNotNull(instance.showCardName("der", 6))
    }
}