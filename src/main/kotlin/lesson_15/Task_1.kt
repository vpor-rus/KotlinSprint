package org.example.lesson_15

/*
В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.*/

fun  main() {
val carp = Carp()
val seagul = Seagul()
val duck = Duck()

carp.swimmingSameLevel()
duck.boardingFromWater()
seagul.lift()
}

interface FloatingCreature {
    fun diving()
    fun ascent()
    fun swimmingSameLevel()
    fun turning()
}

interface FlyingCreature {
    fun takeOffFromGround()
    fun boardingFromWater()
    fun lift()

}

class Carp: FloatingCreature{
    override fun diving() {
        println("сжать плавательный пузырь")
    }

    override fun ascent() {
        println("расправить плавательный пузырь")
    }

    override fun swimmingSameLevel() {
        println("махать плавниками")
    }

    override fun turning() {
        println("не махать плавниками на стороне поворота")
    }
}

class Seagul: FlyingCreature {
    override fun takeOffFromGround() {
        println("частое махание крыльями, разбег")
    }

    override fun boardingFromWater() {
        println("частое махание крыльями и резкий прыжок")
    }

    override fun lift() {
        println("частое махание крыльями")
    }
}

class Duck: FlyingCreature {
    override fun takeOffFromGround() {
        println("частый взмах крыльями")
    }

    override fun boardingFromWater() {
        println("частый взмах крыльями")
    }

    override fun lift() {
        println("частый взмах крыльями")
    }
}