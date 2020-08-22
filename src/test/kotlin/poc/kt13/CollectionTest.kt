package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

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


}