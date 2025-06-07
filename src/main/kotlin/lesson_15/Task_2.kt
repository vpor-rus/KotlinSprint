package org.example.lesson_15

/*
Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные
о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов
погодных данных: Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки
сообщения должен принимать объект типа WeatherStationStats и, в зависимости от типа переданного
объекта, выводить соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.*/

fun main() {
    val temperatureData = Temperature(25)
    val precipitation = PrecipitationAmount(10.5)
    val weatherServer = WeatherServer()
    weatherServer.sentData(temperatureData)
    weatherServer.sentData(precipitation)
}
abstract class WeatherStationStats() {
    abstract fun getData(): String
}

class Temperature(val temperature: Int): WeatherStationStats() {
    override fun getData(): String {
        return "Температура $temperature"
    }
}

class PrecipitationAmount(val amount: Double): WeatherStationStats(){
    override fun getData(): String {
        return "Осадки $amount"
    }
}

class WeatherServer{
    fun sentData(weatherData: WeatherStationStats){
        println(weatherData.getData())
    }
}

