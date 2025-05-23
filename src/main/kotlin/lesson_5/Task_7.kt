package org.example.lesson_5

/*Калькулятор топлива

Программа должна рассчитывать стоимость топлива для поездки в зависимости от расхода автомобиля и текущей цены на бензин.

Запроси следующие данные через консоль. Все данные должны записываться в переменные типа Float или Double:

- Расстояние поездки (в километрах);

- Расход топлива на 100 км (в литрах);

- Текущую цену за литр топлива.

Сначала рассчитай общее количество литров топлива, которое потребуется для поездки по следующей формуле:
 Топливо = (расстояние * расход на 100 км) / 100.

Затем рассчитай общую стоимость топлива по формуле: Стоимость = топливо × цена за литр.

Выведи в консоль общее количество необходимого топлива и итоговую стоимость поездки,
округлив её до двух знаков после запятой.*/

fun  main() {
    println("Введите расстояние в километрах")
    val distanceJourneys = readln().toDouble()
    println("Введите расход топлива в литрах на 100 км")
    val fuelCharge = readln().toDouble()
    println("Введите стоимость горючего, за 1 литр")
    val priceGasoline = readln().toDouble()

    val volumeFuel = (distanceJourneys * fuelCharge) / INDEX_VOLUME

    val payMany = volumeFuel * priceGasoline

    print("Количество топлива для поездки: ")
    println("%.2f".format(volumeFuel))

    print("Стоимость поедки: ")
    println("%.2f".format(payMany))
}

const val INDEX_VOLUME = 100