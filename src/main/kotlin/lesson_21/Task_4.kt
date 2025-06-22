package org.example.lesson_21

import java.io.File

/*
В итоговом проекте блока KotlinSprint мы разрабатываем телеграм-бота на Kotlin, который помогает
пользователям учить иностранные слова. Создай extension функцию для класса File из стандартной
библиотеки, которая будет записывать переданное ей слово в файл.

- дополнительные материалы про файлы есть в 1-2 этапах курсовой;
- функция-расширение должна записывать текст в нижнем регистре;
- функция-расширение должна записывать текст в начало файла.*/

fun main() {
    val file = File(word.txt)
    file.lowerCaseToBeginningOfText("Hello")
    file.lowerCaseToBeginningOfText("World")

    println(file.readText())
}

fun File.lowerCaseToBeginningOfText(word: String) {
    val oldContent = if (this.exists()) this.readText() else ""
    val newContent = word.lowercase() + oldContent
    this.writeText(newContent)
}