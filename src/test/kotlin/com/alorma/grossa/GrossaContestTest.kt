package com.alorma.grossa

import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class GrossaContestTest {

    private val prize1 = getPrize1()
    private val prize2 = getPrize2()
    private val prize3 = getPrize3()
    private val prize4 = getPrize4()
    private val prize5 = getPrize5()

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
        val isPrize = contest.isPrize(Ticket("55141"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized2() {
        val isPrize = contest.isPrize(Ticket("33163"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized3() {
        val isPrize = contest.isPrize(Ticket("99900"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized4() {
        val isPrize = contest.isPrize(Ticket("75100"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized5() {
        val isPrize = contest.isPrize(Ticket("11289"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized5Last3Digits() {
        val isPrize = contest.isPrize(Ticket("00288"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrized2First3Digits() {
        val isPrize = contest.isPrize(Ticket("33100"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrizedWithPrevious() {
        val isPrize = contest.isPrize(Ticket("99995"))

        assertTrue(isPrize)
    }

    @Test
    fun trueWhenTicketIsPrizedWithLater() {
        val isPrize = contest.isPrize(Ticket("99997"))

        assertTrue(isPrize)
    }

    @Test
    fun falseWhenTicketIsNotPrized() {
        val isPrize = contest.isPrize(Ticket("11129"))

        assertFalse(isPrize)
    }

    @Test
    fun prize1WhenTicketIsPrized() {
        val prize = contest.prize(Ticket("00141"))

        assertEquals(prize1, prize)
    }


    @Test
    fun prize3WhenTicketIsPrized() {
        val prize = contest.prize(Ticket("99996"))

        assertEquals(prize3, prize)
    }

    @Test
    fun nullWhenTicketIsNotPrized() {
        val prize = contest.prize(Ticket("11129"))

        assertNull(prize)
    }
}
