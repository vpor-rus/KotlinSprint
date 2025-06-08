package org.example.lesson_16

import kotlin.random.Random

/*
Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получения урона и лечения.

Добавить приватный метод, который вызывается, если при получении урона заканчивается здоровье.
Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.*/

fun main() {
    val ragadar = Player(
        name = "Ragadar",
        health = 10,
        impactForce = 3,
    )
    ragadar.damageReceived()
    ragadar.damageReceived()
    ragadar.treatment()
    ragadar.damageReceived()
    ragadar.damageReceived()
    ragadar.treatment()
}

class Player(
    val name: String,
    private var health: Int,
    var impactForce: Int,
) {
    init {
        print("Создан персонаж $name \nЗдоровье $health \nСила удара $impactForce\n")
    }

    fun damageReceived() {
        val damageLevel = Random.nextInt(1, 11)
        if (health - damageLevel > 0) {
            health -= damageLevel
            println("Вы получили урон $damageLevel \nуровень здоровья снизился до $health\n")
        } else {
            death()
            return
        }
    }

    fun treatment() {
        if (health > 0) {
            val treatmentLevel = Random.nextInt(3, 7)
            health += treatmentLevel
            println("Проведено лечение, уровень здоровья $health\n")
        } else {
            "${death()}, лечение невозможно"
            return
        }
    }

    protected fun death() {
        health = 0
        impactForce = 0
        println("Вы умерли")
        return
    }
}