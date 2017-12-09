package com.alorma.grossa

import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GrossaContestTest {

    private val prizes = listOf(
            Prize("11213"),
            Prize("33242"),
            Prize("00131"),
            Prize("00180"),
            Prize("99181")
    )

    private lateinit var contest: GrossaContest

    @Before
    fun setup() {
        contest = GrossaContest(TicketValidator(), prizes)
    }

    @Test
    fun trueWhenTicketIsPrized1() {
        val isPrize = contest.isPrize(Ticket("11213"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized2() {
        val isPrize = contest.isPrize(Ticket("33242"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized3() {
        val isPrize = contest.isPrize(Ticket("00131"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized4() {
        val isPrize = contest.isPrize(Ticket("00180"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized5() {
        val isPrize = contest.isPrize(Ticket("99181"))

        assertTrue(isPrize)
    }

}
