package org.example.lesson_12

/*Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/

fun main() {
  val tuersdayTemperature = DailyTemperature(301, 276)
}

class DailyTemperature(val dayTemperature: Int, val nightTemperature: Int) {
    init {
        println("Дневная температура: ${kelvinToCelsium(dayTemperature)}\n" +
                "Ночная температура: ${kelvinToCelsium(nightTemperature)}")
    }

}

fun kelvinToCelsium(temperatureKelvin: Int): Int {
       return temperatureKelvin - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM = 275
