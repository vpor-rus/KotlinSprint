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

abstract class Tamagochy{
    abstract fun animalEat()

    open fun sleep() {
        println("животное спит")
    }

}

class Fox : Tamagochy() {
    override fun animalEat() {
        println("Лиса ест ягоды")
    }
}
class Dog : Tamagochy() {
    override fun animalEat() {
        println("собака ест кости")
    }
}
class Cat : Tamagochy() {
    override fun animalEat() {
        println("кошка ест рыбу")
    }
    }