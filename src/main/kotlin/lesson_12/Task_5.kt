package org.example.lesson_12

import kotlin.random.Random

/*Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур
и считать количество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы
случайные значения;
- извлеки из списка дневные и ночные температуры, используя функцию map, а также посчитай количество дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из
стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.*/

fun main() {

    var listForecastMonth = mutableListOf<Int>(0, 0, 0)
    val
    for (i in 1..30) {
        val dailyForecast = diurnalWeather()
        te

    }

    println(listForecastMonth.joinToString())



}

class diurnalWeather(
    val dayTemperature: Int = Random.nextInt(270, 310),
    val nightPrecipitation: Int = Random.nextInt(260, 290),
    val precipitation: Int = Random.nextInt(0,1),
    ) {

}

fun KelvinToCelcium(temperatureToKelvin: Int): Int {
    return temperatureToKelvin - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM  = 275