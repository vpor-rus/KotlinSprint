package org.example.lesson_21

/*
Создай класс игрока, который аналогичен классу Player из задания 20-2.
Помимо имени у игрока должны быть поля с текущим и максимальным здоровьем.
Предположим, что у нас нет возможности редактировать класс (нельзя добавлять новые функции в класс Player).

Требуется реализовать функцию-расширение isHealthy для этого класса, которая будет возвращать true,
если здоровье игрока равно максимальному здоровью, и false в противном случае.*/

fun main() {
    val player1 = Gamer("первый игрок", 100)
    val player2 = Gamer("второй игрок", 33)

    println(player1.isHealty())
    println(player2.isHealty())
}

fun Gamer.isHealty(): Boolean{
    return if (helthLevel == maxLevel) true
    else false
}

data class Gamer(
    val name: String,
    val helthLevel: Int,
    val maxLevel: Int =  100,
)