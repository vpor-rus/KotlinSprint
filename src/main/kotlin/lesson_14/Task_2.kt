package org.example.lesson_14

/*Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.*/

fun main() {

}

open class Layyner(
    val name: String,
    val speed: Int,
    val payLoad: Int,
    val passengerCapacity: Int,
) {
    fun installationHorizontalLadder() {
        println("установлен горизонтальный трап шкафута")
    }
}

class CarrgoShip(
    name: String,
    speed: Int,
    payLoad: Int,
    passengerCapacity: Int,
): Layyner(name, speed, payLoad, passengerCapacity,){
    fun activationLoadingCrane() {
        println("Погрузочный кран активирован")
    }
}

class  IcceBreaker(
    name: String,
    speed: Int,
    payLoad: Int,
    passengerCapacity: Int,
    val BreakingTheIce: Boolean = true
): Layyner(name, speed, payLoad, passengerCapacity) {
    fun openAftGate() {
        println("Кормовые ворота открыты")
    }
}