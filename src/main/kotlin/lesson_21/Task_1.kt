package org.example.lesson_21

/*
Реализуй extension функцию для класса String, которая будет возвращать количество гласных букв в строке.
Назови функцию vowelCount. Например, для строки "hello" функция должна вернуть 2.*/

fun main() {
    val hello = "hello"
    println(hello.voweCount())
}

fun String.voweCount(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}