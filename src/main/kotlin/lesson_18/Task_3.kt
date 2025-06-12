package org.example.lesson_18

/*
В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.

Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.

– опиши эти классы, используя полиморфизм;
– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
– в цикле вызывай метод приема пищи для каждого экземпляра.*/

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val listTamagichy: List<Tamagochy> = listOf(fox, dog, cat)

    for (tamagochy in listTamagichy) {
        tamagochy.animalEat()
    }
}

open class Tamagochy(val name: String) {
    open fun animalEat() {
        when (name) {
            "лиса" -> println("Лиса ест ягоды")
            "собака" -> println("собака ест кости")
            "кошка" -> println("кошка ест рыбу")
            else -> println("такого тамагочи нет в производстве")
        }
    }
}

class Fox : Tamagochy("лиса")
class Dog : Tamagochy("собака")
class Cat : Tamagochy("кошка")