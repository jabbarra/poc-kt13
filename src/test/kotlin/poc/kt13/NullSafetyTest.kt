package poc.kt13

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class NullSafetyTest {

    @Test
    fun notNull() {
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
    fun nullableTest() {
        var otherNullable: String? = null
        val der = otherNullable
        assertNull(der)
    }

    @Test
    fun nullableTestxx() {
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
}