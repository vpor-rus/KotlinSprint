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
    var monthDay = 30  //не выношу в константу, потому что можно поменять на нужное значение
    var preliminaryResultMonthWeather = mutableListOf<OneDayWeather>()
    while (monthDay > 0) {
        preliminaryResultMonthWeather.add(monthWeather.newDayData(
            dayData = Random.nextInt(280..310),
            nightData = Random.nextInt(260..285),
            precipitationData = Random.nextInt(0,2)))
        monthDay--
    }
    val dayTemperatureList = preliminaryResultMonthWeather.map { oneDayWeather -> oneDayWeather.dayTemperature  }
    val nightTemperatureList = preliminaryResultMonthWeather.map { oneDayWeather -> oneDayWeather.nightTemperature}
    val precipitationList = preliminaryResultMonthWeather.map { oneDayWeather -> oneDayWeather.precipitation}

    val editDayTemperatureList = dayTemperatureList.average()

    val editNightTemperatureList = nightTemperatureList.average()
    val editDayAtPrecipitation = precipitationList.sum()

    print("Средняя дневная температура: ")
    println("%02f".format(editDayTemperatureList - KELVIN_IN_KOTLIN))
    print("Средняя ночная температура: ")
    println("%02f".format(editNightTemperatureList - KELVIN_IN_KOTLIN))
    print("Количество дней: $editDayAtPrecipitation")
}

class MonthWeather(
    var dayWeatherList: MutableList<OneDayWeather> = mutableListOf(),
) {
    fun newDayData(
        dayData: Int,
        nightData: Int,
        precipitationData: Int,
    ): OneDayWeather {
        val createNewDayData = OneDayWeather(
            dayTemperature = dayData,
            nightTemperature = nightData,
            precipitation = precipitationData,
        )
        dayWeatherList.add(createNewDayData)
        return createNewDayData
    }
}

class OneDayWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val precipitation: Int,
)

const val  KELVIN_IN_KOTLIN = 275