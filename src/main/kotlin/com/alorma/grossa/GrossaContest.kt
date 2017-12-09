package com.alorma.grossa

class GrossaContest(private val ticketValidator: TicketValidator) {

    fun isValid(ticket: Ticket?): Boolean {
        return ticketValidator.isValid(ticket)
    }
}