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
            Random.nextInt(280..310), Random.nextInt(260..285)
        )
        monthWeather.newPrecipitationData(Random.nextBoolean())
        monthDay--
    }


}

class MonthWeather(
    var dayTemperatureList: MutableList<OneDayTemperature> = mutableListOf(),

    var precipitationList: MutableList<Precipitation> = mutableListOf(),
) {

    fun newDayData(
        dayData: Int,
        nightData: Int,
    ): OneDayTemperature {
        val createNewDayData = OneDayTemperature(
            dayTemperature = dayData,
            nightTemperature = nightData,
        )
        dayTemperatureList.add(createNewDayData)
        return createNewDayData
    }


    fun newPrecipitationData(
        precipitationData: Boolean,
    ): Precipitation {
        val createNewPrecipitationData = Precipitation(precipitation = precipitationData)
        precipitationList.add(createNewPrecipitationData)
        return createNewPrecipitationData
    }

}

class OneDayTemperature(
    val dayTemperature: Int,
    val nightTemperature: Int,
)

class Precipitation(val precipitation: Boolean)