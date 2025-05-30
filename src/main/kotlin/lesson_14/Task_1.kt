package org.example.lesson_14

/*
В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли основаны на базовом
классе лайнера, но каждый из них имеет свой функционал и дополнительные свойства.

- У грузовых кораблей скорость меньше, но грузоподъемность больше.
- У ледоколов ниже и скорость, и вместительность, но они могут колоть лёд.
- Лайнеры могут вмещать наибольшее количество пассажиров.

Спроектируй иерархию классов, задав значения по умолчанию в конструкторе базового класса. Отнаследованные
классы должны переопределять необходимые свойства. Создай по одному экземпляру каждого типа корабля.*/

fun main() {
    val lainer1 = Layner(
        name = "Варяг",
        speed = 12,
        payLoad = 6,
        passengerCapacity = 20
    )

    val cargoShip1 = CargoShip(
        name = "Shtrutenhared",
        speed = 8,
        payLoad = 10,
        passengerCapacity = 20
    )

    val iceBreaker1 = IceBreaker(
        name = "IceMan",
        speed = 5,
        payLoad = 4,
        passengerCapacity = 18,
    )
}

open class Layner(
    val name: String,
    val speed: Int,
    val payLoad: Int,
    val passengerCapacity: Int,
)

class CargoShip(
    name: String,
    speed: Int,
    payLoad: Int,
    passengerCapacity: Int,
): Layner(name, speed, payLoad, passengerCapacity,)

class  IceBreaker(
    name: String,
    speed: Int,
    payLoad: Int,
    passengerCapacity: Int,
    val BreakingTheIce: Boolean = true
): Layner(name, speed, payLoad, passengerCapacity)