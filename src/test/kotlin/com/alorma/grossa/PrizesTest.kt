package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PrizesTest {

    private lateinit var prize: Prize

    @Before
    fun setup() {
        val items = mutableListOf<PrizeItem>()
        items.add(PrizeItem("11213", 0))
        items.add(PrizeItem("11212", 0))
        items.add(PrizeItem("11214", 0))
        items.add(PrizeItem("911", 0))
        items.add(PrizeItem("363", 0))
        items.add(PrizeItem("35", 0))
        items.add(PrizeItem("01212", 0))
        items.add(PrizeItem("01214", 0))
        items.add(PrizeItem("06646", 0))
        items.add(PrizeItem("4", 0))
        items.add(PrizeItem("4875", 0))

        prize = Prize(items)
    }

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
        val check = prize.check("14875")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3LastDigitsPrize() {
        val check = prize.check("77363")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs2LastDigitsPrize() {
        val check = prize.check("52535")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs1LastDigitsPrize() {
        val check = prize.check("42424")

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3FirstDigitsPrize() {
        val check = prize.check("91141")

        assertTrue(check)
    }
}
