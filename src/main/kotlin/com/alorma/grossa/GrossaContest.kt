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

    fun prize(ticket: Ticket): Prize? {
        return prizes.firstOrNull { it.check(ticket.number) }
    }

    fun check(ticket: Ticket): Int {
        if (!isPrize(ticket)) {
            return 0
        }

        var total = 0
        prizes.forEach {
            if (it.check(ticket.number)) {
                val prizeAmount = it.prizeItem(ticket.number)?.amount ?: 0
                total += prizeAmount * ticket.amount
            }
        }
        return total
    }

}