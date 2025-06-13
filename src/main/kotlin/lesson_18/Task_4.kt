package org.example.lesson_18

/*
В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.

Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб,
то только с длиной ребра.*/

fun main() {
    val package1 = BoxRectangular(1, 2, 3)
    val package2 = CubBox(2)
    println(package1.boxArea().toString())
    println(package2.boxArea().toString())

}

open class Box {
    open fun boxArea() = 0
    open fun reformatString() = ""
}

class BoxRectangular(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box() {
    override fun boxArea(): Int {
        return length * width * height
    }

    override fun reformatString(): String {
        return "Площадь равна ${boxArea()}"
    }
}

class CubBox(
    private val edge: Int,
) : Box() {
    override fun boxArea(): Int {
        return edge * edge * edge
    }

    override fun reformatString(): String {
        return "Площадь равна ${boxArea()}"
    }
}


