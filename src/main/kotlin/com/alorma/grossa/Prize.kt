package com.alorma.grossa

class Prize {

    private val items: List<PrizeItem>

    constructor(number: String) {
        items = generateNumbers(number)
    }

    constructor(numbers: List<PrizeItem>) {
        this.items = numbers
    }

    private fun generateNumbers(number: String): List<PrizeItem> {
        val prizes = mutableListOf<PrizeItem>()

        prizes.add(PrizeItem(number))

        val plus = number.toInt().plus(1).toString()
        val minus = number.toInt().minus(1).toString()
        prizes.add(PrizeItem(normalize(plus)))
        prizes.add(PrizeItem(normalize(minus)))

        prizes.add(PrizeItem(getLastDigits(number, 1)))
        prizes.add(PrizeItem(getLastDigits(number, 2)))
        prizes.add(PrizeItem(getLastDigits(number, 3)))
        prizes.add(PrizeItem(getLastDigits(number, 4)))

        prizes.add(PrizeItem(getFirstDigits(number, 3)))

        return prizes
    }

    fun check(ticketNumber: String): Boolean {

        val ticketNumbers = mutableListOf<String>()

        ticketNumbers.add(ticketNumber)

        ticketNumbers.add(ticketNumber)
        ticketNumbers.add(ticketNumber)

        ticketNumbers.add(getLastDigits(ticketNumber, 1))
        ticketNumbers.add(getLastDigits(ticketNumber, 2))
        ticketNumbers.add(getLastDigits(ticketNumber, 3))
        ticketNumbers.add(getLastDigits(ticketNumber, 4))

        ticketNumbers.add(getFirstDigits(ticketNumber, 3))

        ticketNumbers.forEach {
            items.filter { prizeItem -> prizeItem.number.contentEquals(it) }
                    .forEach { return true }
        }

        return false
    }

    private fun getLastDigits(number: String, position: Int): String {
        return number.substring(position until number.length)
    }

    private fun getFirstDigits(number: String, length: Int): String {
        return number.substring(0 until length)
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