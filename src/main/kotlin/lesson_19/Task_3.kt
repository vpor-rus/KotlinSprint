package org.example.lesson_19

/*
В игре есть космический корабль. Он может взлетать, приземляться и отстреливаться от астероида.

Задача описать класс и его методы. Требуемая реализация методов нам пока неизвестна.
Один из методов должен содержать явную пометку-напоминание о том, что здесь нужна информация
о дополнительной логике. Другой метод должен вызывать падение программы с ошибкой NotImplementedError.*/

fun main() {
    val spaceShip = SpaceShip("Восток")

    spaceShip.takeOf()
    spaceShip.land()
    spaceShip.shootBackFromAsteroid()
}

private class SpaceShip(val name: String,) {

    fun takeOf() {
        //TODO("finish writing how it take off")

    }
    fun land() {
        //TODO("реализовать посадку")
    }

    fun shootBackFromAsteroid(): Unit {
    throw NotImplementedError("метод стрельбы не реализован")
    }
}