package org.example.lesson_12

import kotlin.random.Random
import kotlin.random.nextInt

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
    var monthWeather = MonthWeather()
    var monthDay = 30
    while (monthDay > 0) {
        monthWeather.newDayData(
            Random.nextInt(280..310), Random.nextInt(260..285), Random.nextBoolean()
        )
        monthDay--
    }
monthWeather.dayTemperatureList.forEach { print("${it.dayTemperature} / ${it.nightTemperature} // ${it.precipitation} /// ") }

}

class MonthWeather(
    var dayTemperatureList: MutableList<OneDayWeather> = mutableListOf(),
) {
    fun newDayData(
        dayData: Int,
        nightData: Int,
        precipitationData: Boolean,
    ): OneDayWeather {
        val createNewDayData = OneDayWeather(
            dayTemperature = dayData,
            nightTemperature = nightData,
            precipitation = precipitationData,
        )
        dayTemperatureList.add(createNewDayData)
        return createNewDayData
    }
}

class OneDayWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val precipitation: Boolean,
)
