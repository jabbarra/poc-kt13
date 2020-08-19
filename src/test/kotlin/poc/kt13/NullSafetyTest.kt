package poc.kt13

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class NullSafetyTest {

    @Test
    fun nullableWhenSetNull() {
        val valueNull = null
        assertNull(valueNull)
    }

    @Test
    fun notNullable() {
        var notNull = "this can not be null"
        assertNotNull(notNull)
    }

    @Test
    fun nullable() {
        var nullable: String? = "this can  be null"
        assertNotNull(nullable)

        nullable = null
        assertNull(nullable)

        var otherNullable: String? = null
        assertNull(otherNullable)
    }

    @Test
    fun nullableWhenSetNullableVarToOther() {
        var otherNullable: String? = null
        val der = otherNullable
        assertNull(der)
    }

    @Test
    fun nullableWhenUseSafeCall() {
        var otherNullable: String? = null
        var der = otherNullable?.length

        assertNull(der)

        der = 404
        assertNotNull(der)
    }


    @Test
    fun nullLetWhenIsNotNull() {
        var otherNullable: String? = "not null"
        otherNullable?.let {
            assertNotNull(it)
        } ?: run {
            assertNull(otherNullable)
        }
    }

    @Test
    fun nullLetWhenIsNull() {
        var otherNullable: String? = null
        otherNullable?.let {
            assertNotNull(it)
        } ?: run {
            assertNull(otherNullable)
        }
    }

    @Test
    fun whenThrowKotlinNullPointerException() {
        var value : String? = null;
        assertFailsWith<KotlinNullPointerException> {
            value!!
        }
    }

    @Test
    fun subStringWhenUseNonNullAssertedShouldThrowKotlinNullPointerException() {
        var value : String? = null;
        assertFailsWith<KotlinNullPointerException> {
            value!!.substring(0)
        }
    }

    @Test
    fun subStringWhenUseSaferShouldNotThrowKotlinNullPointerException() {
        var value : String? = null;
        assertNull(value?.substring(0))
    }

    @Test
    fun subStringWhenUseNullCheck() {
        var value : String? = null
        if(value != null) {
            assertNotNull(value.substring(0))
        } else {
            assertNull(value?.substring(0))
            assertFailsWith<KotlinNullPointerException> {
                value!!.substring(0)
            }
        }
    }

}