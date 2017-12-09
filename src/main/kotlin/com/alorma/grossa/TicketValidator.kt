package com.alorma.grossa

class TicketValidator {
    fun isValid(ticket: Ticket?): Boolean {
        return if (ticket == null) {
            false
        } else ticket.number.isNotEmpty() && ticket.number.length == 5
    }
}