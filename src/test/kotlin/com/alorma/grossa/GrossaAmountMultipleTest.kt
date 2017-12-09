package com.alorma.grossa

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GrossaAmountMultipleTest {

    private val prize1 = getMultiplePrize1()
    private val prize2 = getMultiplePrize2()

    private val prizes = listOf(
            prize1,
            prize2
    )

    private lateinit var contest: GrossaContest

    @Before
    fun setup() {
        contest = GrossaContest(TicketValidator(), prizes)
    }

    @Test
    fun maxPrize1And3LastDigitsPrice2WithNum55141() {
        val prize = contest.check(Ticket("55141"))

        assertEquals(100100, prize)
    }
}
