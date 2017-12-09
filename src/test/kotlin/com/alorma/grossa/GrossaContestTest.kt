package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GrossaContestTest {

    private lateinit var contest: GrossaContest

    @Before
    fun setup() {
        contest = GrossaContest()
    }

    @Test
    fun falseWhenTicketIsNull() {
        val valid = contest.isValid(null)

        assertFalse(valid)
    }

    @Test
    fun falseWhenTicketNumberIsEmpty() {
        val valid = contest.isValid(Ticket(""))

        assertFalse(valid)
    }

    @Test
    fun falseWhenTicketNumberIsLessThan5Chars() {
        val valid = contest.isValid(Ticket("101"))

        assertFalse(valid)
    }

    @Test
    fun trueWhenTicketNumberIsExactlyThan5Chars() {
        val valid = contest.isValid(Ticket("10112"))

        assertTrue(valid)
    }

    @Test
    fun falseWhenTicketNumberIsLongerThan5Chars() {
        val valid = contest.isValid(Ticket("10112112"))

        assertFalse(valid)
    }

}
