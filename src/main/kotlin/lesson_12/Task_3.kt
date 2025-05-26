package org.example.lesson_12

/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой
возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/

fun main() {

    val thursdayWeather = WeatherDailys(
        _dayTimeTemperature = 320,
        _nightTemperature = 278,
    )
    println("${thursdayWeather.dayTimeTemperature}  ${thursdayWeather.nightTemperature}")
}

class WeatherDailys(_dayTimeTemperature: Int, _nightTemperature: Int) {
    val dayTimeTemperature = _dayTimeTemperature - KELVIN_TO_CELSIUM
    var nightTemperature = _nightTemperature - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM = 275