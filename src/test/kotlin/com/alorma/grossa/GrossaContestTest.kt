package com.alorma.grossa

import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class GrossaContestTest {

    private val prize1 = Prize("11213")
    private val prize2 = Prize("33242")
    private val prize3 = Prize("00131")
    private val prize4 = Prize("00180")
    private val prize5 = Prize("99181")

    private val prizes = listOf(
            prize1,
            prize2,
            prize3,
            prize4,
            prize5
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

    @Test
    fun trueWhenTicketIsPrized5Last3Digits() {
        val isPrize = contest.isPrize(Ticket("00181"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized2First3Digits() {
        val isPrize = contest.isPrize(Ticket("33219"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrizedWithPrevious() {
        val isPrize = contest.isPrize(Ticket("99180"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrizedWithLater() {
        val isPrize = contest.isPrize(Ticket("99182"))

        assertTrue(isPrize)
    }

    @Test
    fun falseWhenTicketIsNotPrized() {
        val isPrize = contest.isPrize(Ticket("11129"))

        assertFalse(isPrize)
    }

    @Test
    fun prize1WhenTicketIsPrized() {
        val prize = contest.prize(Ticket("11213"))

        assertEquals(prize1, prize)
    }


    @Test
    fun prize3WhenTicketIsPrized() {
        val prize = contest.prize(Ticket("00131"))

        assertEquals(prize3, prize)
    }

    @Test
    fun nullWhenTicketIsNotPrized() {
        val prize = contest.prize(Ticket("11129"))

        assertNull(prize)
    }
}
