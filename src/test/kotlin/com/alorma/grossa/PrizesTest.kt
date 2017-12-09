package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PrizesTest {

    private val prize = Prize.create("11213")

    @Test
    fun trueWhenIs5DigitsPrize() {
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5PreviousDigitsPrize() {
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5LaterDigitsPrize() {
        val check = prize.check("11213")

        assertTrue(check)
    }

    @Test
    fun falseWhenIs5LaterDigitsNotPrize() {
        val check = prize.check("33427")

        assertFalse(check)
    }

    @Test
    fun trueWhenIs4LastDigitsPrize() {
        val check = prize.check("1213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3LastDigitsPrize() {
        val check = prize.check("213")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs2LastDigitsPrize() {
        val check = prize.check("13")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs1LastDigitsPrize() {
        val check = prize.check("3")

        assertTrue(check)
    }
}
