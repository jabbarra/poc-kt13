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
                .filterIndexed { index: Int, i: Int ->  index != 0 && i < 3}
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
        val (match, rest)  = listOf(1, 2, 4, 5, 6).partition { it < 3 }
        assertEquals(listOf(1, 2), match)
        assertEquals(listOf(4, 5, 6), rest)
    }

    @Test
    fun `predicates `() {
        val lowerThanThree = { x: Int -> x < 3 }
        val numbers = listOf(1, 2, 4, 5, 6)
        var result = numbers.any(lowerThanThree)
        assertTrue(result)

        result = numbers.all(lowerThanThree)
        assertFalse(result)

        val count  = numbers.count(lowerThanThree)
        assertEquals(2, count)

        val theFirstMatch  = numbers.find(lowerThanThree)
        assertEquals(1, theFirstMatch)
    }

    @Test
    fun `map simple use`() {
        val result = listOf(1, 2).map { it * 2 }
        assertEquals(listOf(2, 4), result)
    }

    @Test
    fun `map and filter use`() {
        val payers = listOf(
                ClassPayer("omar", 10),
                ClassPayer("barra", 20))

      //  val result = payers.find { it -> it.age > 10 }.ma

     //   assertEquals(listOf(2, 4), result)
    }


    @Test
    fun `flatMap simple use`() {
      //  val list = listOf("12", "67").flatMap((x) -> x.to )
       // assertEquals(listOf('1', '2', '6', '7'), list)
    }

    @Test
    fun `map and filter uske`() {
        val payers = listOf(
                ClassPayer("omar", 10, arrayOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD)),
                ClassPayer("barra", 20, arrayOf(EnumPaymentTerm.TC, EnumPaymentTerm.TD)))


        //  val result = payers.find { it -> it.age > 10 }.ma

        //   assertEquals(listOf(2, 4), result)
    }

}