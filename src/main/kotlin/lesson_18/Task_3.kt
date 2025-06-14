package org.example.lesson_18

/*
В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.

Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.

– опиши эти классы, используя полиморфизм;
– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
– в цикле вызывай метод приема пищи для каждого экземпляра.*/

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val listTamagichy: List<Tamagochy> = listOf(fox, dog, cat)

    for (tamagochy in listTamagichy) {
        tamagochy.animalEat()
    }
}

abstract class Tamagochy(val name: String){
    abstract fun animalEat()

    fun sleep() {
        println("$name спит")
    }

}

class Fox (name: String): Tamagochy(name) {
    override fun animalEat() {
        println("$name ест ягоды")
    }
}
class Dog (name: String) : Tamagochy(name) {
    override fun animalEat() {
        println("собака ест кости")
    }
}
class Cat(name: String) : Tamagochy(name) {
    override fun animalEat() {
        println("$name ест рыбу")
    }
    }