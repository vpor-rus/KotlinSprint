package org.example.lesson_19

/*
Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список
выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).*/

fun main() {
    println("Введите имя и пол.\n Имя в строковом формате. \n Пол вводится латиницой заглавными буквами(MAN/WOMAN)")
    val listIdentity = mutableListOf<Identity>()

    var count = 1

    while (count <= 5) {
        println("введите имя и пол пользователя №$count: ")
        val input = readln().trim()
        val parts = input.split(" ")
        if (parts.size != 2) {
            println("Неправильно ввели данные")
            continue
        }
        val name = parts[0]
        val sexInput = parts[1].uppercase()

        val sex = try {
            Sex.valueOf(sexInput)
        } catch (e: IllegalArgumentException) {
            println("неверный формат, введите MAN или WOMAN")
            continue
        }
        listIdentity.add(Identity(name, sex))
        count++
    }

    println("вывожу список людей: ")
    listIdentity.forEach { identity -> println("имя: ${identity.name}\nпол: ${identity.sex}") }
}

private class Identity(
    val name: String,
    val sex: Sex,
)

enum class Sex {
    MAN, WOMAN,
}