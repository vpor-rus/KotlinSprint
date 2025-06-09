package org.example.lesson_17

/*
Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.*/

fun main() {
val blackHugar = Ship("BlackHugar", 23, "Tartuga")
    blackHugar.mutableName = "NeverChange"
}

private class Ship(name: String, var mediumSpeed: Int, var homePort: String,) {
    var mutableName: String = name
        set(value) {
           field = print("Нельзя изменить имя корабля").toString()
        }
}