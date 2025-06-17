package org.example.lesson_19

/*
Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список
выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).*/

fun main() {
    println("Введите имя и пол.\n Имя в строковом формате. \n Пол вводится латиницой заглавными буквами(MAN/WOMAN)")
    val fileCabinet = FileCabinet(mutableListOf())

}

private class FileCabinet(
    listIdentity: MutableList<Identity>,
)

private class Identity(
    name: String,
    sex: Sex,
)

enum class Sex {
    MAN,
    WOMAN,
}