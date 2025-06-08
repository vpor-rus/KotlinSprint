package org.example.lesson_16

import kotlin.random.Random

/*
На игральном кубике может выпасть одно число от 1 до 6.

Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом.
Единственный способ узнать это число – вызвать специальный метод, который напечатает информацию в консоль.*/
fun main() {
val playerTurn = RandomNumber()
    playerTurn.printValue()
}

class RandomNumber {

    private val randomValue = Random.nextInt(1, 7)

    fun printValue() {
        println("Значение после броска кубика равно $randomValue")
    }
}
