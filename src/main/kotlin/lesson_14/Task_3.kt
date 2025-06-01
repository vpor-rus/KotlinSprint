package org.example.lesson_14

import org.example.lesson_4.REQUIRED_CONDITION

/*
Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
Каждая фигура имеет свой цвет и уникальные параметры:

- для круга — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления площади и
периметра в каждом из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.*/

fun main() {
    val circle1 = Circle(
        color = "red",
        radius = 3,
    )

    val rectangle1 = Rectangle(
        color = "blue",
        height = 2,
        width = 4,
    )

    circle1.perimetrOfFigure()
    circle1.areaOfFigure()
    println()
    rectangle1.perimetrOfFigure()
    rectangle1.areaOfFigure()
}

abstract class Figure(
    val color: String,
) {
    abstract fun areaOfFigure()
    abstract fun perimetrOfFigure()
}

class Circle(
    color: String,
    val radius: Int,
): Figure(color,) {
    override fun areaOfFigure() {
        val areaCircle = 2 * PI * (radius * radius)
        println("Площадь круга равна $areaCircle см")
    }

    override fun perimetrOfFigure() {
        val perimetrCircle = 2 * PI * radius
        println("Окружность равна $perimetrCircle см")
    }
}

class Rectangle(
    color: String,
    val height: Int,
    val width: Int,
): Figure(color,){
    override fun areaOfFigure() {
        val areaRectangle = height * width
        println("Площадь прямоугольника $areaRectangle см")
    }

    override fun perimetrOfFigure() {
        val perimetrRectangle = (2 * height) + (2 * width)
        println("Периметр прямоугольника $perimetrRectangle см")
    }
}

const val PI = 3.14