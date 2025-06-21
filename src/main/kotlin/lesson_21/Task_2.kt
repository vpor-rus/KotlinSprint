package org.example.lesson_21

/*
Создайте extension функцию evenNumbersSum для списка целых чисел, которая будет возвращать
сумму всех четных чисел в списке. Четными считаются числа, которые делятся на 2 без остатка.*/

fun main() {
    val listNumber1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 99, 150)
    println(listNumber1.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Long {
    return this.filter { it % 2 == 0 }.map { it.toLong() }.sum()

}