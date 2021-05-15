package ru.netology

fun main() {
    val whenWasUser = 17000  // в секундах
    agoToText(whenWasUser)
}

fun agoToText(whenWasUser: Int) {
    when {
        whenWasUser in 0..60 -> return println("был(а) в сети только что")
        whenWasUser in 61..60 * 60 -> {
            val minutes = whenWasUser / 60
            return println("был(а) в сети $minutes ${endOfMinutes(minutes)} назад")
        }
        whenWasUser in 60 * 60 + 1..24 * 60 * 60 -> {
            val hours = whenWasUser / 3600
            return println("был(а) в сети $hours ${endOfHours(hours)} назад")
        }
        whenWasUser in 24 * 60 * 60 + 1..48 * 60 * 60 -> return println("был(а) в сети сегодня")
        whenWasUser in 48 * 60 * 60 + 1..72 * 60 * 60 -> return println("был(а) в сети вчера")
        whenWasUser > 72 * 60 * 60 + 1 -> return println("был(а) в сети давно")
    }
}

fun endOfMinutes(minutes: Int): String {
    return when {
        minutes % 10 == 1 -> return "минуту"
        minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4 -> return "минуты"
        else -> "минут"
    }
}

fun endOfHours(hours: Int): String {
    return when {
        hours % 10 == 1 -> return "час"
        hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4 -> return "часа"
        else -> "часов"

    }
}