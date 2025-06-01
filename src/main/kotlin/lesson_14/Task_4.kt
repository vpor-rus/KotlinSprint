package org.example.lesson_14

/*
В компьютерной игре существуют планеты. У некоторых из них есть спутники.

Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.

- планета должна хранить список спутников.

Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.*/

fun main() {
    val satelit1 = Satelit(
        name = "Амальтеа",
        atmosphere = false,
        posibleLanding = false
    )
    val satelit2 = Satelit(
        name = "Фива",
        atmosphere = true,
        posibleLanding = false
    )
    val planet1 = Planet(
        name = "Юпитер",
        atmosphere = false,
        posibleLanding = false,
        listSatelite = mutableListOf(satelit1, satelit2)
    )
    println("Планета: ${planet1.name}")
    println()
    planet1.listSatelite.forEach { satelit -> println("спутник: ${satelit.name}") }

}

abstract class CosmicBodi(
    val name: String,
    val atmosphere: Boolean,
    val posibleLanding: Boolean,
    )

class Planet(
    name: String,
    atmosphere: Boolean,
    posibleLanding: Boolean,
    val listSatelite: MutableList<Satelit> = mutableListOf(),
): CosmicBodi(name, atmosphere, posibleLanding,)

class Satelit(
    name: String,
    atmosphere: Boolean,
    posibleLanding: Boolean,
): CosmicBodi(name,atmosphere, posibleLanding)
