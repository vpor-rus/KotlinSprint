package org.example.lesson_17

/*
Создай класс, описывающий элемент викторины. В primary конструкторе два текстовых
свойства: вопрос и ответ.

Явно пропиши для вопроса геттер, для ответа геттер и сеттер.*/

fun main() {
    val qwizle = Victorina()
    qwizle.question
    qwizle.answer
}

private class Victorina {
    val question: String = "String"
        get() = field

    var answer: String = "String"
        set(value) {
            field = value
        }
}