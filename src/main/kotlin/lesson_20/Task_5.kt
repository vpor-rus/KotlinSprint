package org.example.lesson_20

/*
Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающей лямбду.

Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно). Реализуй модификатор,
инвертирующий слова робота.

В результате в главной функции должен быть воспроизведен такой алгоритм:
– Вызов say(). Метод печатает одну фразу в обычном виде.
– Вызов setModifier(). Устанавливает переданный в него модификатор строки.
– Вызов say(). Метод выводит одну фразу в инвертированном виде.*/

fun main() {

    val bender = Robot("Bender")

    bender.say()
}

private class Robot(name: String){
    private var modifier: ((String) -> String)? = null

    fun say() {
        val phrase = PhraseRobot.values().random().phrase
        val output = modifier?.invoke(phrase) ?: phrase
        println(output)
    }

    fun setModifer(mod: (String) -> String) {
        modifier = mod
    }
}

enum class PhraseRobot(val phrase: String){
    TRUTH("Все что угодно, кроме бессмертия, - бесполезная трата времени."),
    LAZINESS("На помощь! Я слишком ленив чтобы спасаться"),
    JOY("Знаешь что меня подбадривает? Издевательство над чужими неудачами"),
    BETRAYAL("Не бейте меня!.. Я предам кого угодно"),
    SHAME("Мне так стыдно! Хочу, чтобы все умерли"),
}