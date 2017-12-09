package com.alorma.grossa

import org.junit.Before

class PrizesAmountTest {

    private lateinit var contest: GrossaContest

    @Before
    fun setup() {
        val prize1 = getPrize1()
        val prize2 = getPrize2()
        val prize3 = getPrize3()
        val prize4 = getPrize4()
        val prize5 = getPrize5()

        val list = listOf(prize1, prize2, prize3, prize4, prize5)

        contest = GrossaContest(TicketValidator(), list)
    }
}
