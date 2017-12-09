package com.alorma.grossa

class Prize(numbers: List<PrizeItem>) {

    private val items: List<PrizeItem> = numbers

    fun generateNumbers(number: String): List<PrizeItem> {
        val prizes = mutableListOf<PrizeItem>()

        prizes.add(PrizeItem(number, 0))

        val plus = number.toInt().plus(1).toString()
        val minus = number.toInt().minus(1).toString()
        prizes.add(PrizeItem(plus.normalize(), 0))
        prizes.add(PrizeItem(minus.normalize(), 0))

        prizes.add(PrizeItem(number.takeFrom(1), 0))
        prizes.add(PrizeItem(number.takeFrom(2), 0))
        prizes.add(PrizeItem(number.takeFrom(3), 0))
        prizes.add(PrizeItem(number.takeFrom(4), 0))

        prizes.add(PrizeItem(number.first(3), 0))

        return prizes
    }

    fun check(ticketNumber: String): Boolean {

        val ticketNumbers = mutableListOf<String>()

        ticketNumbers.add(ticketNumber)

        ticketNumbers.add(ticketNumber)
        ticketNumbers.add(ticketNumber)

        ticketNumbers.add(ticketNumber.first(1))
        ticketNumbers.add(ticketNumber.first(2))
        ticketNumbers.add(ticketNumber.first(3))
        ticketNumbers.add(ticketNumber.first(4))

        ticketNumbers.add(ticketNumber.takeFrom(3))

        ticketNumbers.forEach {
            items.filter { prizeItem -> prizeItem.number.contentEquals(it) }
                    .forEach { return true }
        }

        return false
    }
}