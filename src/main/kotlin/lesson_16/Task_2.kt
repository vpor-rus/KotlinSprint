package org.example.lesson_16

/*
Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга,
используя радиус.

Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.

Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.*/

fun main() {
    val round = Circle(3)
    println(round.areaOfCircle)
    println(round.round)
}

class Circle(private val radius: Int) {
    private val Pi = 3.14
    val round = 2 * Pi * radius
    val areaOfCircle = Pi * (radius * radius)
}

