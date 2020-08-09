package poc.kt13

import kotlin.test.Test
import kotlin.test.assertEquals

class WhenTest {

    @Test
    fun whenTest() {
        var value = 2021
        val result = when (value) {
            2016, 2017 -> "itr and title"
            2018 -> "globant"
            in 2019 .. 2020 -> "sysone"
            2021, 2022 -> {
                val version = 1.3
                "kotlin $version"
            }
            else -> "maru"
        }

        assertEquals("kotlin 1.3", result)
    }
}