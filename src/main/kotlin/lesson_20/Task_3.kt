package org.example.lesson_20

/*
В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять,
есть ли у игрока ключ. Функция должна принимать объект игрока и возвращать строку: «Игрок открыл дверь»,
если ключ есть, и «Дверь заперта», если ключа нет.

Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.*/

fun main() {
    val player2 = Player("второй игрок", false)

    val openTheDoor: (Player) -> String = { player -> if (player.presenceOfKey) "дверь открыта"
    else "нет ключа, дверь закрыта"}

    println(openTheDoor(player2))
    player2.presenceOfKey = true
    println()
    println(openTheDoor(player2))
}

private data class Player(
    val name: String,
    var presenceOfKey: Boolean = false,
)