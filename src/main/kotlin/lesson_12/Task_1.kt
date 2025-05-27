package org.example.lesson_12

/*Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре
 и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом
созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор.*/

fun main() {
    val mondayWeather = WeatherDay()
    val tuesdayWeather = WeatherDay()

    println(mondayWeather.dayTimeTemperature)
    println(mondayWeather.nightTemperature)
    println(mondayWeather.precipitation)

    mondayWeather.dayTimeTemperature = 6
    mondayWeather.nightTemperature = -3
    mondayWeather.precipitation = false

    println(mondayWeather.dayTimeTemperature)
    println(mondayWeather.nightTemperature)
    println(mondayWeather.precipitation)

    tuesdayWeather.dayTimeTemperature = 10
    tuesdayWeather.nightTemperature = 0

    println(tuesdayWeather.dayTimeTemperature)
    println(tuesdayWeather.nightTemperature)
    println(tuesdayWeather.precipitation)

}

class WeatherDay {
    var dayTimeTemperature = 1
    var nightTemperature = -3
    var precipitation = true
}