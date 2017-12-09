package com.alorma.grossa



fun getPrize1(): Prize {
    val items = mutableListOf<PrizeItem>()

    items.add(PrizeItem("55141", 20000))
    items.add(PrizeItem("55140", 200))
    items.add(PrizeItem("55142", 200))
    items.add(PrizeItem("05141", 100))
    items.add(PrizeItem("00141", 35))
    items.add(PrizeItem("55100", 5))
    items.add(PrizeItem("00041", 5))
    items.add(PrizeItem("00001", 1))

    return Prize(items)
}

fun getPrize2(): Prize {
    val items = mutableListOf<PrizeItem>()

    items.add(PrizeItem("33163", 6500))
    items.add(PrizeItem("33164", 65))
    items.add(PrizeItem("33162", 65))
    items.add(PrizeItem("03163", 30))
    items.add(PrizeItem("00163", 20))
    items.add(PrizeItem("33100", 5))
    items.add(PrizeItem("00063", 2))
    items.add(PrizeItem("00003"))

    return Prize(items)
}

fun getPrize3(): Prize {
    val items = mutableListOf<PrizeItem>()

    items.add(PrizeItem("99996", 3000))
    items.add(PrizeItem("99997", 50))
    items.add(PrizeItem("99995", 50))
    items.add(PrizeItem("09996", 20))
    items.add(PrizeItem("00996", 10))
    items.add(PrizeItem("99900", 5))
    items.add(PrizeItem("00096", 2))
    items.add(PrizeItem("00006"))

    return Prize(items)
}

fun getPrize4(): Prize {
    val items = mutableListOf<PrizeItem>()

    items.add(PrizeItem("75144", 1000))
    items.add(PrizeItem("75145", 20))
    items.add(PrizeItem("75143", 20))
    items.add(PrizeItem("05144", 10))
    items.add(PrizeItem("00144", 5))
    items.add(PrizeItem("75100", 5))
    items.add(PrizeItem("00044", 1))
    items.add(PrizeItem("00004"))

    return Prize(items)
}

fun getPrize5(): Prize {
    val items = mutableListOf<PrizeItem>()

    items.add(PrizeItem("11288", 500))
    items.add(PrizeItem("11289", 15))
    items.add(PrizeItem("11287", 15))
    items.add(PrizeItem("01288", 10))
    items.add(PrizeItem("00288", 5))
    items.add(PrizeItem("11200", 5))
    items.add(PrizeItem("00088", 1))
    items.add(PrizeItem("00008"))

    return Prize(items)
}
