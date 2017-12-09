package com.alorma.grossa

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class TicketValidatorTest {

    private lateinit var ticketValidator: TicketValidator

    @Before
    fun setup() {
        ticketValidator = TicketValidator()
    }

    @Test
    fun falseWhenTicketIsNull() {
        val valid = ticketValidator.isValid(null)

        assertFalse(valid)
    }

    @Test
    fun falseWhenTicketNumberIsEmpty() {
        val valid = ticketValidator.isValid(Ticket(""))

        assertFalse(valid)
    }

    @Test
    fun falseWhenTicketNumberIsLessThan5Chars() {
        val valid = ticketValidator.isValid(Ticket("101"))

        assertFalse(valid)
    }

    @Test
    fun trueWhenTicketNumberIsExactlyThan5Chars() {
        val valid = ticketValidator.isValid(Ticket("10112"))

        assertTrue(valid)
    }

    @Test
    fun falseWhenTicketNumberIsLongerThan5Chars() {
        val valid = ticketValidator.isValid(Ticket("10112112"))

        assertFalse(valid)
    }

}
