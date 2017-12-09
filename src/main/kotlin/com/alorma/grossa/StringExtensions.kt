package com.alorma.grossa


fun String.first(position: Int): String {
    return substring(0 until position)
}

fun String.takeFrom(pos: Int): String {
    return substring(pos until length)
}

fun String.normalize(): String {
    val diff = 5 - length
    if (diff > 0) {
        var text = this

        (1..diff).forEach { text = "0" + text }

        return text
    }
    return this
}

fun String.inverseNormalize(): String {
    val diff = 5 - length
    if (diff > 0) {
        var text = this
        (1..diff).forEach { text += "0" }

        return text
    }
    return this
}