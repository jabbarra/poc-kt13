package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CollectionTest {

    @Test
    fun `filter simple use`() {
        val result = listOf(1, 2, 4, 5, 6).filter { it < 3 }
        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun `filterNot use`() {
        val result = listOf(1, 2, 4, 5, 6).filterNot { it < 3 }
        assertEquals(listOf(4, 5, 6), result)
    }

    @Test
    fun `filterIndexed use`() {
        val result = listOf(1, 2, 4, 5, 6)
                .filterIndexed { index: Int, i: Int -> index != 0 && i < 3 }
        assertEquals(listOf(2), result)
    }

    @Test
    fun `filterIsInstance use`() {
        val result = listOf(null, 1, "two", 3.0, "four")
                .filterIsInstance<String>()
        assertEquals(listOf("two", "four"), result)
    }

    @Test
    fun `partition use`() {
        val (match, rest) = listOf(1, 2, 4, 5, 6).partition { it < 3 }
        assertEquals(listOf(1, 2), match)
        assertEquals(listOf(4, 5, 6), rest)
    }

    @Test
    fun `predicates any and all and count and find `() {
        val lowerThanThree = { x: Int -> x < 3 }
        val numbers = listOf(1, 2, 4, 5, 6)
        var result = numbers.any(lowerThanThree)
        assertTrue(result)

        result = numbers.all(lowerThanThree)
        assertFalse(result)

        val count = numbers.count(lowerThanThree)
        assertEquals(2, count)

        val theFirstMatch = numbers.find(lowerThanThree)
        assertEquals(1, theFirstMatch)
    }

    @Test
    fun `map simple use`() {
        val result = listOf(1, 2).map { it * 2 }
        assertEquals(listOf(2, 4), result)
    }

    @Test
    fun `map and filter use`() {
        val result = listOf(1, 2, 4, 5, 6).map { it * 2 }.filter { it < 3 }
        assertEquals(listOf(2), result)
    }

    @Test
    fun `filter and map use`() {
        val result = listOf(1, 2, 4, 5, 6).filter { it < 3 }.map { it * 2 }
        assertEquals(listOf(2, 4), result)
    }

    @Test
    fun `flatMap simple use`() {
        val list = listOf("12", "67").flatMap { it.toList() }
        assertEquals(listOf('1', '2', '6', '7'), list)
    }

    @Test
    fun `flatMap simple use with param`() {
        val toList = { x: String -> x.toList() }
        val list = listOf("12", "67").flatMap(toList)
        assertEquals(listOf('1', '2', '6', '7'), list)
    }

    /**
     * FlatMap needs a Iterable
     */
    @Test
    fun `flatMap compare with map`() {
        val data = listOf(DataTest(listOf("a", "b", "c")), DataTest(listOf("1", "2", "3")))
        val flatMapped = data.flatMap { it.items }
        assertEquals(listOf("a", "b", "c", "1", "2", "3"), flatMapped)

        val mapped = data.map { it.items }
        assertEquals(listOf(listOf("a", "b", "c"), listOf("1", "2", "3")), mapped)
    }

    /**
     * FlatMap needs a Iterable, it does not accept Array
     * Map accepts Array
     */
    @Test
    fun `flatMap compare with map use with Array`() {
        val payers = listOf(
                ClassPayer("omar", 10, arrayOf(EnumPaymentTerm.TC)),
                ClassPayer("barra", 20, arrayOf(EnumPaymentTerm.TD)))

        var resultFlatMapped = payers.flatMap { it.paymentTerms!!.asList() }
        assertEquals(listOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD), resultFlatMapped)

        var result = payers.map { it.paymentTerms }
        //TODO why this do not pass?
       // assertEquals(listOf(arrayOf(EnumPaymentTerm.TC), arrayOf(EnumPaymentTerm.TD)), result)
    }

}

class DataTest(val items: List<String>) {
}

