package com.alorma.grossa


fun String.first(position: Int): String {
    return this.substring(position until length)
}

fun String.takeFrom(pos: Int): String {
    return this.substring(0 until pos)
}

fun String.normalize(): String {
    val diff = 5 - length
    if (diff > 0) {
        var text = this
        (1..diff).forEach { text = "0$this" }

        return text
    }
    return this
}