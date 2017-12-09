package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class GrossaContestTest {

    private val validator = TicketValidator()

    @Test
    fun trueWhenIs5DigitsPrize() {
        val contest = GrossaContest(validator, Prize("11213"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5PreviousDigitsPrize() {
        val contest = GrossaContest(validator, Prize("11212"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5LaterDigitsPrize() {
        val contest = GrossaContest(validator, Prize("11214"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5PreviousDigitsPrizeWithZeros() {
        val contest = GrossaContest(validator, Prize("01212"))
        val check = contest.isPrize(Ticket("01213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs5LaterDigitsPrizeWithZeros() {
        val contest = GrossaContest(validator, Prize("01214"))
        val check = contest.isPrize(Ticket("01213"))

        assertTrue(check)
    }

    @Test
    fun falseWhenIs5PreviousDigitsPrizeWith2Zeros() {
        val contest = GrossaContest(validator, Prize("00212"))
        val check = contest.isPrize(Ticket("01213"))

        assertFalse(check)
    }

    @Test
    fun falseWhenIs5LaterDigitsPrizeWith2Zeros() {
        val contest = GrossaContest(validator, Prize("00214"))
        val check = contest.isPrize(Ticket("01213"))

        assertFalse(check)
    }

    @Test
    fun trueWhenIs4LastDigitsPrize() {
        val contest = GrossaContest(validator, Prize("21213"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3LastDigitsPrize() {
        val contest = GrossaContest(validator, Prize("33213"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs2LastDigitsPrize() {
        val contest = GrossaContest(validator, Prize("33413"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs1LastDigitsPrize() {
        val contest = GrossaContest(validator, Prize("33483"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }

    @Test
    fun trueWhenIs3FirstDigitsPrize() {
        val contest = GrossaContest(validator, Prize("11201"))
        val check = contest.isPrize(Ticket("11213"))

        assertTrue(check)
    }


}
