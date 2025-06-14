package org.example.lesson_18

/*
В приложении есть экран, на котором можно рисовать различные фигуры, указывая координаты (x, y).
Фигурами могут быть круг, квадрат и точка. Координаты могут быть представлены типами данных Int и Float.

Создайте класс Screen, который будет содержать методы draw для рисования каждой фигуры с координатами
типов Int и Float. Каждый метод должен возвращать строку, указывающую, какая фигура нарисована и в
каких координатах. Используйте перегрузку методов для реализации.*/

fun main() {

}

abstract class Screen{
    abstract fun draw()
}

class CircleInt(
    private val x: Int,
    private val y: Int,
    private val radius: Int,
) : Screen() {
    override fun draw() {
        println("Центр круга находится на координате $x и $y, вокруг центра рисуется окружность с радиусом $radius")
    }
}

class CircleFloat(
    private  val x: Float,
    private  val y: Float,
    private val radius: Float,
): Screen() {
    override fun draw() {
        println("Центр круга находится на координате $x и $y, вокруг центра рисуется окружность с радиусом $radius")
    }
}

class SquareInt(
    private val x: Int,
    private val y: Int,
    private val top: Int,
    private val left: Int,
    private val right: Int,
    private val bottom: Int,
): Screen() {
    override fun draw() {
        println("Центр четырехугольника(точка пересечения диагоналей) располагается на координате $x и $y" +
                "вокруг строится четырехугольник с левой стороной равной $left, верхней равной $top, " +
                "правой равной $right, нижней равной $bottom")
    }
}

class SqureFloat(
    private val x: Float,
    private val y: Float,
    private val top: Float,
    private val left: Float,
    private val right: Float,
    private val bottom: Float,
): Screen() {
    override fun draw() {
        "Центр четырехугольника(точка пересечения диагоналей) располагается на координате $x и $y" +
                "вокруг строится четырехугольник с левой стороной равной $left, верхней равной $top, " +
                "правой равной $right, нижней равной $bottom")
    }
}

class DotInt(
    private  val x: Int,
    private val y: Int,
): Screen() {
    override fun draw() {
        println("на коорлинате $x и $y рисуется точка)
    }
}

class DotInt(
    private val x: Float,
    private val y: Float,
): Screen() {
    override fun draw() {
        println("на коорлинате $x и $y рисуется точка)
    }
}