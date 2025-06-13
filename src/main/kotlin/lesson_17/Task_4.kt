package org.example.lesson_17

/*Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер.*/

fun main() {
val package1 = PostalPackage(987, "Москва")
    package1.location = "Иркутск"
    package1.location = "Путятина"
    println(package1.counter)
}

private class PostalPackage(val number: Int, _location: String) {
    var counter = 1
    private var nextLocation = _location
    var location: String
        get() = nextLocation
        set(value) {
            if (nextLocation != value){
                nextLocation = value
                counter++
            }
        }
}