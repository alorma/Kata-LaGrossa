package com.alorma.grossa

class GrossaContest(private val ticketValidator: TicketValidator,
                    private val prize: Prize) {

    private fun isValid(ticket: Ticket?): Boolean {
        return ticketValidator.isValid(ticket)
    }

    fun isPrize(ticket: Ticket): Boolean {
        if (!isValid(ticket)) {
            return false
        }

        return prize.check(ticket.number)
    }

}