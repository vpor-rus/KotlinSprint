package org.example.lesson_12

/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/

fun main() {

    val mondayWeather = WeatherDaily(
        dayTimeTemperature = 18,
        nightTemperature = 2,
        precipitation = true,
    )
    println(mondayWeather.dayTimeTemperature)
    println(mondayWeather.nightTemperature)
    println(mondayWeather.precipitation)
}

class WeatherDaily(
    var dayTimeTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean,
)