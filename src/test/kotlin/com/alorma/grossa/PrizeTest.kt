package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class PrizeTest {

    @Test
    fun trueWhenIs5DigitsPrize() {
        val prize = Prize("11213")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5PreviousDigitsPrize() {
        val prize = Prize("11212")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5LaterDigitsPrize() {
        val prize = Prize("11214")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5PreviousDigitsPrizeWithZeros() {
        val prize = Prize("01212")
        val check = prize.check("01213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5LaterDigitsPrizeWithZeros() {
        val prize = Prize("01214")
        val check = prize.check("01213")

        assertTrue(check)
    }

    @Test
    fun falseWhenIs5PreviousDigitsPrizeWith2Zeros() {
        val prize = Prize("00212")
        val check = prize.check("01213")

        assertFalse(check)
    }

    @Test
    fun falseWhenIs5LaterDigitsPrizeWith2Zeros() {
        val prize = Prize("00214")
        val check = prize.check("01213")

        assertFalse(check)
    }

    @Test
    fun trueWhenIs4LastDigitsPrize() {
        val prize = Prize("21213")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3LastDigitsPrize() {
        val prize = Prize("33213")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs2LastDigitsPrize() {
        val prize = Prize("33413")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs1LastDigitsPrize() {
        val prize = Prize("33483")
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3FirstDigitsPrize() {
        val prize = Prize("11201")
        val check = prize.check("11213")

        assertTrue(check)
    }


}
