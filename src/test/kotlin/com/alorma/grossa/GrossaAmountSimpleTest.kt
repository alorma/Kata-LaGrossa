package com.alorma.grossa

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GrossaAmountSimpleTest {

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
    fun maxPrizeWhenTicketIsPrizedFirstPrize() {
        val prize = contest.check(Ticket("55141"))

        assertEquals(100000, prize)
    }

    @Test
    fun maxPrizeWhenTicketIsPrizedSecondPrize() {
        val prize = contest.check(Ticket("33163"))

        assertEquals(32500, prize)
    }

    @Test
    fun maxPrizeWhenTicketIsPrizedThirdPrize() {
        val prize = contest.check(Ticket("99996"))

        assertEquals(15000, prize)
    }

    @Test
    fun maxPrizeWhenTicketIsPrizedFourthPrize() {
        val prize = contest.check(Ticket("75144"))

        assertEquals(5000, prize)
    }

    @Test
    fun maxPrizeWhenTicketIsPrizedFifthPrize() {
        val prize = contest.check(Ticket("11288"))

        assertEquals(2500, prize)
    }
}
