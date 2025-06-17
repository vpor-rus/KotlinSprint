package org.example.lesson_19

/*В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish). Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю,
каких рыб он может добавить в свой аквариум, распечатав список в консоль.*/

fun main() {
    println("Для своего аквариума вы можете выбрать: ")
val listFish: List<Fish> = Fish.entries
    println(listFish)
}

enum class Fish{
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}