package org.example.lesson_19

/*
В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара. Синие – 5 единиц,
зеленые – 10, красные – 20.

– создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
 При выстреле в консоль должен выводиться нанесенный урон;
– создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– экземпляр танка при создании ничем не заряжен;
– в решении должен использоваться enum.*/

fun main() {
val hellcat = Tank()

    hellcat.newAmmunitionReload(Ammunition.GREEN)
    hellcat.shot()

    hellcat.newAmmunitionReload(Ammunition.RED)
    hellcat.shot()

    hellcat.newAmmunitionReload(Ammunition.BLUE)
    hellcat.shot()
}

private class Tank{
    var cartridgeInChamber: Ammunition? = null

    fun newAmmunitionReload(ammunition: Ammunition) {
    cartridgeInChamber = ammunition
        println("заряжен патрон $ammunition")
    }

    fun shot() {
        val damage = cartridgeInChamber?.damageLevel()
        if (damage != null) {
        println("ВЫСТРЕЛ! нанесен урон $damage")
        cartridgeInChamber = null
        } else {println("Выстрел невозможен. Зарядите патрон.")}
    }
}

enum class Ammunition {
    BLUE,
    GREEN,
    RED;

    fun damageLevel(): Int = when(this) {
        BLUE -> 5
        GREEN -> 10
        RED -> 20
    }
}