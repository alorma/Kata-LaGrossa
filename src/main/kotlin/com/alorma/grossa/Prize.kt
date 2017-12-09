package com.alorma.grossa

class Prize(private val number: String) {

    fun check(ticketNumber: String): Boolean {
        if (number.contentEquals(ticketNumber)) {
            return true
        } else {

            val plus = number.toInt().plus(1).toString()
            val minus = number.toInt().minus(1).toString()

            when {
                normalize(plus).contentEquals(ticketNumber) -> return true
                normalize(minus).contentEquals(ticketNumber) -> return true
                else -> when {
                    checkLastDigits(number, ticketNumber, 1) -> return true
                    checkLastDigits(number, ticketNumber, 2) -> return true
                    checkLastDigits(number, ticketNumber, 3) -> return true
                    checkLastDigits(number, ticketNumber, 4) -> return true
                    checkFirstDigits(number, ticketNumber, 3) -> return true

                }
            }
        }
        return false
    }

    private fun checkLastDigits(number: String, ticketNumber: String, position: Int): Boolean {
        val prize4Digits = number.substring(position until number.length)
        val ticket4Digits = ticketNumber.substring(position until ticketNumber.length)
        return prize4Digits.contentEquals(ticket4Digits)
    }

    private fun checkFirstDigits(number: String, ticketNumber: String, length: Int): Boolean {
        val prize4Digits = number.substring(0 until length)
        val ticket4Digits = ticketNumber.substring(0 until length)
        return prize4Digits.contentEquals(ticket4Digits)
    }

    private fun normalize(number: String): String {
        val diff = 5 - number.length
        if (diff > 0) {
            var text = number
            (1..diff).forEach { text = "0$number" }

            return text
        }
        return number
    }
}