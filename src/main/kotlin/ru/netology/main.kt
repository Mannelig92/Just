package ru.netology

fun main() {
    val whenWasUser = 4000  // в секундах
    println(agoToText(whenWasUser))
}

fun agoToText(whenWasUser: Int): String {
    return when {
        whenWasUser in 0..60 -> "был(а) в сети только что"
        whenWasUser in 61..60 * 60 -> {
            val minutes = whenWasUser / 60
            "был(а) в сети $minutes ${endOfMinutes(minutes)} назад"
        }
        whenWasUser in 60 * 60 + 1..24 * 60 * 60 -> {
            val hours = whenWasUser / 3600
            "был(а) в сети $hours ${endOfHours(hours)} назад"
        }
        whenWasUser in 24 * 60 * 60 + 1..48 * 60 * 60 -> "был(а) в сети сегодня"
        whenWasUser in 48 * 60 * 60 + 1..72 * 60 * 60 -> "был(а) в сети вчера"
        whenWasUser > 72 * 60 * 60 + 1 -> "был(а) в сети давно"

        else -> "В сети"  //Честно говоря не знал что вписать в этот else так как по сути он уже не нужен,
                          //но без него как я понял никак, возможно есть какой-то выход, но я его пока не знаю
    }
}

fun endOfMinutes(minutes: Int): String {
    return when {
        minutes % 10 == 1 -> "минуту"
        minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4 -> "минуты"
        else -> "минут"
    }
}

fun endOfHours(hours: Int): String {
    return when {
        hours % 10 == 1 -> "час"
        hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4 -> "часа"
        else -> "часов"

    }
}