package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class ForTest {

    @Test
    fun forWithRange() {
        for (index in 0 .. 10){
            if(index == 10) {
                assertEquals(10, index)
                return
            }
        }
        fail("there is a mistake in the range")
    }

    @Test
    fun forWithRangeUntil() {
        for (index in 0 until 10){
            if(index == 10) {
                fail("there is a mistake in the range")
            }
        }
    }

    @Test
    fun forWithRangeStep() {
        for (index in 0 .. 10 step 2){
           print(index)
        }
    }

    @Test
    fun forWithRangeDownToStep() {
        val range =  10 downTo 0 step 2
        for (index in range){
            print(index)
        }
    }
}