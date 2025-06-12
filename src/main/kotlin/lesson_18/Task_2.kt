package org.example.lesson_18

import kotlin.random.Random

/*
В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.

Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод,
бросающий кость и печатающий значение в консоль.

Для демонстрации полиморфизма “включения”:

- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.*/

fun main() {
    val cube6 = CubeSixFaces()
    val cube4 = CubeFourFaces()
    val cube8 = CubeEightFaces()

    val gameList: List<CubeInGame> = listOf(cube4, cube6, cube8)

    for (cube in gameList) {
        cube.rollOfDice()
    }
}

open class CubeInGame(val faces: Int) {

    open fun rollOfDice() {
        val result = Random.nextInt(1, faces + 1)
        println("При броске кубика с количеством граней $faces результат равен $result")
    }
}

class CubeFourFaces : CubeInGame(4)

class CubeSixFaces : CubeInGame(6)

class CubeEightFaces : CubeInGame(8)