package com.alorma.grossa

class GrossaContest(private val ticketValidator: TicketValidator,
                    private val prizes: List<Prize>) {

    private fun isValid(ticket: Ticket?): Boolean {
        return ticketValidator.isValid(ticket)
    }

    fun isPrize(ticket: Ticket): Boolean {
        if (!isValid(ticket)) {
            return false
        }

        return prizes.any { it.check(ticket.number) }
    }

}